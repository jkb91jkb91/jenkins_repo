@Library("my_Library") _
pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                    def emailInstance = new my_Library.Email()
                    echo "Wartość stałej MY_CONSTANT: ${emailInstance.MY_CONSTANT}"
               
                }
            }
        }
    }
}

