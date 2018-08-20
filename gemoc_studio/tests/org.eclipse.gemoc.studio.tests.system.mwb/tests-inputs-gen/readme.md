This folder contains the tests inputs that'll be used be the tests.
It is generated from other locations using a maven script. 

Use the following command to generate it (and synchronize its content with the real sources)
'''
mvn generate-sources
'''

Please note that the mvn command supposes that some git repositories exists next to the current one. In particular, it expects a repository "gemoc-studio"
