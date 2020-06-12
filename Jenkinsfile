pipeline {
    agent any
    stages {
        /*
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
        */
        stage('Deployment Stage') {
            steps {
                echo 'hello wolrd'
                withMaven(maven:'maven'){
             //   bat 'mvn deploy'
                 bat 'mvn install'
               
                }
            }
        
        }
        
        stage('Push Container'){
  steps{
echo "workspace is $WORKSPACE"
//dir("$WORKSPACE\repe"){

script{
//docker.withDockerRegistry('https://index.docker.io/v1','dockerhub')
    withDockerRegistry(registry: [url: 'https://index.docker.io/v1/', credentialsId:'dockerhub']) {
def image=docker.build('aziznoori/alzap-store')
image.push()
    }
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
