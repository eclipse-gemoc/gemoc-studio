#!groovy
node {
   def mvnHome
   stage('Preparation') {
   
      // Get code from GitHub repositories

      // this will check if there is a branch with the same name as the current branch and use that for the checkout, but if there is no
      // branch with the same name it will fall back to the master branch
      dir('gemoc-studio') {
         def gemocstudioScm = resolveScm source: [$class: 'GitSCMSource', credentialsId: '', id: '_', remote: 'https://github.com/eclipse/gemoc-studio.git', traits: [[$class: 'BranchDiscoveryTrait']]], targets: [BRANCH_NAME, 'master']
         checkout gemocstudioScm
      }
      dir('gemoc-studio-modeldebugging') {
         def gemocstudiomodeldebuggingScm = resolveScm source: [$class: 'GitSCMSource', credentialsId: '', id: '_', remote: 'https://github.com/eclipse/gemoc-studio-modeldebugging.git', traits: [[$class: 'BranchDiscoveryTrait']]], targets: [BRANCH_NAME, 'master']
         checkout gemocstudiomodeldebuggingScm
      }
      sh "ls"
      // Get the Maven tool.
      // ** NOTE: This 'apache-maven-latest' Maven tool must be configured in the global configuration.           
      mvnHome = tool 'apache-maven-latest'
   }
   stage('Build') {
      // Run the maven build without any test            
      dir ('gemoc-studio/dev_support/full_compilation') {
         sh "'${mvnHome}/bin/mvn' -DskipTests=true clean package --debug --errors -P ignore_CI_repositories,!use_CI_repositories"
      }      
   }
   stage('Tests') {
      // Run the maven build without  the tests but off line (this is supposed to be already downloaded)            
      dir ('gemoc-studio/dev_support/full_compilation') {
         sh "'${mvnHome}/bin/mvn' -o -Dmaven.test.failure.ignore verify --debug --errors -P ignore_CI_repositories,!use_CI_repositories"
      }      
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archiveArtifacts '**/target/products/*.zip'
   }
}