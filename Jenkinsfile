pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile -Drevision=${BUILD_NUMBER}'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}