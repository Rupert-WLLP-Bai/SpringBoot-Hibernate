pipeline {
    agent any
    stages {
stage('Build') {
            steps {
                echo 'Building..'
                // 使用mvnw命令构建项目
                sh 'mvnw clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // 使用mvnw命令测试项目
                sh 'mvnw test'
            }
        }
        // 运行项目
        stage('Run') {
            steps {
                echo 'Running..'
                // 先结束上一次使用mvnw命令运行的项目
                sh 'mvnw spring-boot:stop'
                // 再使用mvnw命令运行项目, 并且保持后台运行
                sh 'mvnw spring-boot:start'
            }
        }
    }
}