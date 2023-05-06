pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                script {
                    def jarName = sh(
                        script: "ls target/*.jar | head -1 | xargs basename",
                        returnStdout: true
                    ).trim()
                    sh "java -jar target/${jarName} &"
                }
            }
        }
    }
}