pipeline {
    agent any
    tools {
        maven 'Maven 3.6'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn clean install'
            }
        }
    }
}