pipeline {
    agent any

    environment {
            REVISION = VersionNumber (versionNumberString: "${BUILD_NUMBER}")
        }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile -Drevision=$REVISION'
                bat 'echo ${REVISION}'
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