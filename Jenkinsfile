pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                   helloWorld()
               
                }
            }
        }
          stage('Remote2 Job Trigger') {
            steps {
                script {
                    
                
                    withCredentials([usernamePassword(credentialsId: 'MySecret', usernameVariable: 'username', passwordVariable: 'password')]) {
                        sh "echo '$username and $password'"
                    }
                    
                  
                   
                    
                }
            }
        }
    }
}

