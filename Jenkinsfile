@Library('pipeline-shared-lib') _
pipeline {
    agent any


    
    stages {

        
        stage('Hello') {
       

            steps {
                script {
                     knife.printName 'hello'
                     slackSend (color: '#00FF00', message: "Build successful") 
            }
        }
    }
}
}


