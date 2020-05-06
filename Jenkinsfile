pipeline {
  agent any
  stages {
      stage('Build') {
        steps {
          sh './mvnw clean package'
        }
      }

      stage('Test') {
        steps {
          sh './mvnw clean test'
        }
      }

      stage('Custom') {
        steps {
          echo 'Mission accomplished'
        }
      }
  }
}