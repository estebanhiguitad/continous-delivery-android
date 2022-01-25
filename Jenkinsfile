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

        stage('Unit Tests') {
          steps{
            echo "------------>Unit Tests<------------"
            sh "./gradlew test"
          }
        }
    }

}