pipeline {
    agent any
    stages {
        stage('Compile Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
                sh 'mvn clean compile'
                }
            }
        
        }
        stage('Testing Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
                sh 'mvn test'
                }
            }
        
        }
        
        stage('Deployment Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
                sh 'mvn deploy'
                }
            }
        
        }
        
         stage('good bye') {
            steps {
                echo 'good bye'
            }
        }
    }
}
