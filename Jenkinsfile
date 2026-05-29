pipeline {
    agent any

    tools {
        jdk 'JDK25'
        maven 'Maven3'
    }

    stages {

        stage('Clone') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/PriyabrataRoy/flipkart-selenium-project.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target',
                reportFiles: 'cucumber-reports.html',
                reportName: 'Flipkart Cucumber Report'
            ])
        }
    }
}