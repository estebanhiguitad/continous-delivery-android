pipeline{
    agent {
        label 'Slave_Mac'
    }

    options {
      	buildDiscarder(logRotator(numToKeepStr: '3'))
     	disableConcurrentBuilds()
    }

    stages{
        stage('Deploy to Play Store') {
          steps{
            echo "------------>Deployment<------------"
            sh "bundle exec fastlane internal versionName:${params['versionName']} releaseNotes:\"${params['releaseNotes']}\""
          }
        }
    }
}