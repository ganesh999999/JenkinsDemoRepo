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
                script {
                    if (isUnix()) {
                        sh 'mvn clean install'
                        sh 'ls -la target/'  // List files to verify the JAR file exists
                    } else {
                        bat 'mvn clean install'
                        bat 'dir target\\'  // List files to verify the JAR file exists
                    }
                }
            }
        }

        stage('Run Application') {
            steps {
                script {
                    if (isUnix()) {
						 timeout(time: 10, unit: 'MINUTES') {
                        sh 'echo Starting application...'
                        // Assuming the JAR file is located in the target directory after mvn install
                        sh 'java -jar target/JenkinsDemo-0.0.1-SNAPSHOT.jar'
                        }
                    } else {
						 timeout(time: 10, unit: 'MINUTES') {
                        sh 'echo Starting application...'
                        bat 'java -jar target\\JenkinsDemo-0.0.1-SNAPSHOT.jar'
                        }
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
				 timeout(time: 15, unit: 'MINUTES') {
                       sh 'echo Deploying application...'
                       sh 'mvn spring-boot:run'
                }
            }
        }
    }
}