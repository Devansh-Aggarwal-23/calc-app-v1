pipeline {
    agent any
    stages {
         stage('Checkout'){
            steps{
                git branch: 'main',
                url: 'https://github.com/shivai-07/calc-app-v1.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Testing') {
            steps {
                bat 'mvn test'
            }
        }
        stage('package') {
            steps {
                bat 'mvn package'
            }
        }
    }
      post {
        success {
            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed!'
        }
    }
}