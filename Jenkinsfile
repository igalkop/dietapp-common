pipeline {
    agent any

    environment {
        // Define a custom revision using the Jenkins BUILD_NUMBER
        REVISION = "${BUILD_NUMBER}"
    }

    stages {
        stage('Build') {
            steps {
                // Update the revision property in pom.xml
                script {
                    bat "mvn versions:set-property -Dproperty=revision -DnewVersion=${REVISION}"
                }

                bat 'mvn clean package'
//                 bat 'echo ${REVISION}'
            }
        }

//         stage('Test') {
//             steps {
//                 bat 'mvn test'
//             }
//         }

//         stage('Publish') {
//             steps {
//                 bat 'mvn install -Drevision=$REVISION'
//             }
//         }
    }
}