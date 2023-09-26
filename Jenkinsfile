@Library("my_Library") _
pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                   def emailClass = load("src/jenkins_shared_libraries/Email.groovy")
                   echo "Wartość stałej MY_CONSTANT: ${emailClass.MY_CONSTANT}"

               
                }
            }
        }
    }
}

