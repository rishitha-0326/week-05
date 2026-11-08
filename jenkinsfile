
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/rishitha-0326/week-05.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac factorial.java testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java testfactorial'
            }
        }
    }

    post {
        success {
            echo 'Factorial Testing Successful!'
        }
    }
}
