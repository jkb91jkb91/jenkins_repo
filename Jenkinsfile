@Library("my_Library") _
pipeline {
    agent any

    stages {
        stage('Remote Job Trigger') {
            steps {
                script {
                    def emailInstance = new my_Library.Email(this)
                  // my_Library.Email.()
         
                     // def m = new Email(this)
                     // m.send(
                     //      subjectTag   : 'FAILURE',
                     //      to:          : 'also-to-me@gmail.com',
                     //      body         : '&lt;p&gt;Test failed!&lt;/p&gt;',
                     //      addProviders : true
                     //  )
               
                }
            }
        }
    }
}

