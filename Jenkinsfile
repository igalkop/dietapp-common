pipeline {
    agent any

    stages {
//         stage('Checkout') {
//             steps {
//                 git branch: 'main', url: 'https://github.com/igalkop/dietapp-common.git'
//             }
//         }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}