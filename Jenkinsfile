pipeline {
    agent any

    tools {
        maven 'Maven_3.9.9'  // Adjust based on your Maven installation
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/ganesh999999/JenkinsDemoRepo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
                script {
                    if (isUnix()) {
                        // For Unix/Linux environments
                        sh 'java -jar JenkinsDemo.jar'
                    } else {
                        // For Windows environments
                        bat 'java -jar JenkinsDemo.jar'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn spring-boot:run'
            }
        }
    }
}
