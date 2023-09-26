@Library("my_Library") _
pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                   helloWorld()
                   emailext body: 'Test Message',
                    subject: 'Test Subject',
                    to: 'jakub.g26101991@gmail.com'
               
                }
            }
        }
    }
}

