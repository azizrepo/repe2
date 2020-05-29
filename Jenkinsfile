pipeline {
    agent any
    stages {
        stage('Compile Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
                bat 'mvn clean compile'
                }
            }
        
        }
        stage('Testing Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
                bat 'mvn test'
                }
            }
        
        }
        
        stage('Deployment Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
             //   bat 'mvn deploy'
                 bat 'mvn install'
               
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
