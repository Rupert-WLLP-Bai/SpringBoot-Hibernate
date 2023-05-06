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
                    // 先停止之前启动过的jar包, 位置是target目录下
                    sh 'ps -ef | grep java | grep target | grep -v grep | awk \'{print $2}\' | xargs kill -9'
                    // 启动新的进程
                    def jarName = sh(
                        script: "ls target/*.jar | head -1 | xargs basename",
                        returnStdout: true
                    ).trim()
                    // 后台启动, 并且在Jenkins退出之后, 依然可以继续运行
                    sh "nohup java -jar target/${jarName} &"
                }
            }
        }
    }
}