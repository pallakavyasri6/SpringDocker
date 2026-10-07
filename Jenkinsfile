pipeline {

    agent any
     tools {
    maven 'Maven 3'
}
    triggers {
        githubPush()
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Spring Boot application...'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t springdocker:latest .'
            }
        }

        stage('Docker Run') {
            steps {
                echo 'Starting Docker container...'
                bat 'docker rm -f spring-container || exit 0'
                bat 'docker run -d -p 8083:8080 --name spring-container springdocker:latest'
            }
        }
    }

    post {

        success {
            echo 'CI/CD Pipeline completed successfully!'
        }

        failure {
            echo 'CI/CD Pipeline failed!'
        }
    }
}// Automatic CI CD trigger test
