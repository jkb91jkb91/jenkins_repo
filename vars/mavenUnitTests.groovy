def execute() {
    tool name: env.JDK_VERSION, type: 'hudson.model.JDK'
    sh 'export JAVA_HOME=$JAVA_HOME_8'
    sh 'mvn test'
}
