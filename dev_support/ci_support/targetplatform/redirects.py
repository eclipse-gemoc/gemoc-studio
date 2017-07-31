#!/bin/env/python
import os,time,json,shutil,sys

AGGREGATED_UPDATE='update'
MIRRORED_UPDATE='archive'
SCRIPT_HOME=os.getcwd()
sites = {}


def compute_repository_content(name,urls,timestamp):
    compositeArtifacts = "<?xml version='1.0' encoding='UTF-8'?>\n\
    <?compositeArtifactRepository version='1.0.0'?>\n\
    <repository name='%s' type='org.eclipse.equinox.internal.p2.artifact.repository.CompositeArtifactRepository' version='1.0.0'>\n\
      <properties size='1'>\n\
          <property name='p2.timestamp' value='%s'/>\n\
            </properties>\n\
              <children size='%d'>\n" % (name,timestamp,len(urls))
    compositeContent = "<?xml version='1.0' encoding='UTF-8'?>\n\
    <?compositeMetadataRepository version='1.0.0'?>\n\
    <repository name='%s' type='org.eclipse.equinox.internal.p2.metadata.repository.CompositeMetadataRepository' version='1.0.0'>\n\
      <properties size='1'>\n\
          <property name='p2.timestamp' value='%s'/>\n\
            </properties>\n\
              <children size='%d'>\n" % (name,timestamp,len(urls))
    for url in urls:
       compositeArtifacts +="<child location='%s'/>\n" % url
       compositeContent +="<child location='%s'/>\n" % url
    compositeArtifacts += "</children>\n\
                    </repository>\n"
    compositeContent += "</children>\n\
                    </repository>\n"
    return (compositeArtifacts,compositeContent)

def produce_repository(name,urls,timestamp):
    (compositeArtifacts,compositeContent) =  compute_repository_content(name,urls,timestamp)
    if not os.access(name,os.F_OK):
        os.mkdir(name)
    with open(name + '/compositeArtifacts.xml', 'w') as the_file:
      the_file.write(compositeArtifacts)
    with open(name + '/compositeContent.xml', 'w') as the_file:
      the_file.write(compositeContent)
    print "creating redirect : %s" % name

def generate_redirects(sitejsonfile='sites.json'):
  with open(sitejsonfile,'r') as json_file:
      sites = json.load(json_file)

  print json.dumps(sites,sort_keys=True,indent=4, separators=(',', ': '))

  if os.access(AGGREGATED_UPDATE,os.F_OK):
      shutil.rmtree(AGGREGATED_UPDATE)
  os.mkdir(AGGREGATED_UPDATE)
  os.chdir(AGGREGATED_UPDATE)

  allurls = []
  timestamp = time.time() 
  for name,urls in sites.iteritems():
      allurls += urls
      produce_repository(name,urls,timestamp)


  for name,urls in sites.iteritems():
      produce_repository('all-except-' + name,set(allurls) - set(urls),timestamp)

  produce_repository(".",sites.keys(),timestamp)

  #now preparing for mirroring

  os.chdir('../')
  if os.access(MIRRORED_UPDATE,os.F_OK):
      shutil.rmtree(MIRRORED_UPDATE)
  os.mkdir(MIRRORED_UPDATE)
  os.chdir(MIRRORED_UPDATE)

  pomContent='<?xml version="1.0" encoding="UTF-8"?>\n\
  <project>\n\
      <modelVersion>4.0.0</modelVersion>\n\
      <name>Mirroring</name>\n\
      <groupId>org.gemoc.gemoc_studio</groupId>\n\
      <artifactId>org.gemoc.gemoc_studio.root</artifactId>\n\
      <version>1.0.0-SNAPSHOT</version>\n\
      <packaging>pom</packaging>\n\
  \n\
      <properties>\n\
	  <tycho-version>0.24.0</tycho-version>\n\
	  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n\
      </properties>\n\
  \n\
      <build>\n\
	  <plugins>\n\
	      <plugin>\n\
		  <groupId>org.eclipse.tycho</groupId>\n\
		  <artifactId>tycho-maven-plugin</artifactId>\n\
		  <version>${tycho-version}</version>\n\
		  <extensions>true</extensions>\n\
	      </plugin>\n\
	      <plugin>\n\
		  <groupId>org.eclipse.tycho.extras</groupId>\n\
		  <artifactId>tycho-p2-extras-plugin</artifactId>\n\
		  <version>${tycho-version}</version>\n\
		  <executions>\n'

  for name,urls in sites.iteritems():
      if not os.access(name,os.F_OK):
	  os.mkdir(name)
      pomContent +="<execution>\n\
			  <id>archive %s</id>\n\
			  <phase>package</phase>\n\
			  <goals>\n\
			      <goal>mirror</goal>\n\
			  </goals>\n\
			  <configuration>\n\
			      <source>\n\
				  <repository>\n\
				      <url>%s</url>\n\
				  </repository>\n\
			      </source>\n\
			      <append>true</append>\n\
			      <destination>%s</destination>\n\
			  </configuration>\n\
		      </execution>\n" % (name,SCRIPT_HOME + "/" + AGGREGATED_UPDATE+ "/" + name,SCRIPT_HOME + "/" + MIRRORED_UPDATE+ "/" + name)
  pomContent += "                </executions>\n\
	      </plugin>\n\
	  </plugins>\n\
      </build>\n\
  </project>"

  with open('pom.xml', 'w') as the_file:
	the_file.write(pomContent)

  for name,urls in sites.iteritems():
      produce_repository('all-except-' + name,set(map( lambda x : '../' + x,sites.keys())) - set(name),timestamp)

  produce_repository(".",sites.keys(),timestamp)


def main(argv):
   if len(argv)==0:
     generate_redirects()
   if len(argv)==1:
     generate_redirects(argv[0])
   
if __name__ == "__main__":
   main(sys.argv[1:])
