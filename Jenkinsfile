pipeline {
    agent any

    environment {
        // Define a custom revision using the Jenkins BUILD_NUMBER
        REVISION = "${BUILD_NUMBER}"
    }

    stages {

        stage('Set Version') {
            steps{
                // Update the revision property in pom.xml
                script {
                    bat "mvn versions:set-property -Dproperty=revision -DnewVersion=${REVISION}"
                }
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean compile -DskipTests'
            }
        }

        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }



        stage('Publish Locally') {
            steps {
                bat 'mvn install -DskipTests'
            }
            post {
            // If the maven build succeeded, archive the JUnit test reports for display in the Jenkins web UI
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }

        stage('Publish to Github Packages') {
            steps {
                bat 'mvn deploy -DskipTests'
            }
        }
    }
}