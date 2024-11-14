pipeline {
    agent any

    environment {
            REVISION = versionNumberString: "${BUILD_NUMBER}"
        }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile -Drevision=$REVISION'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}