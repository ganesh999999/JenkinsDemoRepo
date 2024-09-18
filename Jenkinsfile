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
					 ws('C:\\JenkinsWorkspaces\\JenkinsDemoPL') {
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
        }
   stage('Verify JAR Existence') {
       steps {
        bat 'dir target'
       }
   }
        stage('Run Application') {
            steps {
                script {
					timeout(time: 10, unit: 'MINUTES') {
                    if (isUnix()) {
                        // Assuming the JAR file is located in the target directory after mvn install
                        sh 'java -jar target/JenkinsDemo-0.0.1-SNAPSHOT.jar'
                    } else {
                        //bat 'java -jar target\\JenkinsDemo-0.0.1-SNAPSHOT.jar'
                        bat 'start /B java -jar target\\JenkinsDemo-0.0.1-SNAPSHOT.jar'
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
                sh 'mvn spring-boot:run'
            }
        }
    }
}