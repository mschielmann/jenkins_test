pipeline {
    agent any
    tools {
        maven 'Default maven'
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