@Library("my_Library") _
pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                  my_Library.Email.print()
               
                }
            }
        }
    }
}

