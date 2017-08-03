#!groovy
node {
   catchError {
	   def mvnHome
	   stage('Preparation') {
	   
	      // Get code from GitHub repositories
	
	      // this will check if there is a branch with the same name as the current branch (ie. the branch containing this Jenkinsfile) and use that for the checkout, but if there is no
	      // branch with the same name it will fall back to the master branch
	      dir('gemoc-studio') {
	         def gemocstudioScm = resolveScm source: [$class: 'GitSCMSource', credentialsId: '', id: '_', remote: 'https://github.com/eclipse/gemoc-studio.git', traits: [[$class: 'BranchDiscoveryTrait']]], targets: [BRANCH_NAME, 'master']
	         checkout gemocstudioScm
	      }
	      dir('gemoc-studio-modeldebugging') {
	         def gemocstudiomodeldebuggingScm = resolveScm source: [$class: 'GitSCMSource', credentialsId: '', id: '_', remote: 'https://github.com/eclipse/gemoc-studio-modeldebugging.git', traits: [[$class: 'BranchDiscoveryTrait']]], targets: [BRANCH_NAME, 'master']
	         checkout gemocstudiomodeldebuggingScm
	      }
	      echo 'Content of the workspace'
	      sh "ls"
	      // Get the Maven tool.
	      // ** NOTE: This 'apache-maven-latest' Maven tool must be configured in the global configuration.
	      // in order to find existing tools and their name, use the snippet generator available in the target jenkins instance (ie.  "Pipeline Syntax" link on the job)         
	      mvnHome = tool 'apache-maven-latest'
	   }
	   stage('Build') {
	      // Run the maven build without any test            
	      dir ('gemoc-studio/dev_support/full_compilation') {
	         // sh "'${mvnHome}/bin/mvn' -DskipTests=true clean package --debug --errors -P ignore_CI_repositories,!use_CI_repositories"
	         sh "'${mvnHome}/bin/mvn' -DskipTests=true clean package --errors -P ignore_CI_repositories,!use_CI_repositories"
	      }      
	   }
	   stage('Tests') {
	      // Run the maven build with the tests (integration tests need Xvnc)
	      // run offline (this is supposed to be already downloaded)
	      dir ('gemoc-studio/dev_support/full_compilation') {
	         wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
	            // sh "'${mvnHome}/bin/mvn' -o -Dmaven.test.failure.ignore verify --debug --errors -P ignore_CI_repositories,!use_CI_repositories"
	            sh "'${mvnHome}/bin/mvn' -o -Dmaven.test.failure.ignore verify --errors -P ignore_CI_repositories,!use_CI_repositories"
	         }
	      }      
	   }
	   stage('Results') {
	      junit '**/target/surefire-reports/TEST-*.xml'
	      archiveArtifacts '**/target/products/*.zip,**/gemoc-studio/gemoc_studio/releng/org.eclipse.gemoc.gemoc_studio.updatesite/target/repository/**'
	   }
   }
   step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: '', sendToIndividuals: true])
}
