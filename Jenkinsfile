pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile -Drevision=${BUILDS_ALL_TIME}'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}