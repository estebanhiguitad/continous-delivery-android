pipeline{
    agent {
        label 'Slave_Mac'
    }

    options {
      	buildDiscarder(logRotator(numToKeepStr: '3'))
     	disableConcurrentBuilds()
    }

    stages{
        stage('Compile') {
          steps {
            echo "------------>Compile<------------"
            sh "./gradlew build -x test"
          }
        }

        stage('Instrumented Tests') {
          steps{
            echo "------------>Unit Tests<------------"
            sh "./gradlew connectedAndroidTest"
          }
        }

        stage('Deploy to Play Store') {
          steps{
            echo "------------>Deployment<------------"
            sh "bundle exec fastlane internal versionName:${params['versionName']} releaseNotes:\"${params['releaseNotes']}\""
          }
        }
    }

}