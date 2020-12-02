pipeline {
    agent any
        tools {
        maven 'apache-maven-3.6.3' 
    }
    stages {
        stage('Build Stage') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test Stage') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') { 
            steps {
                bat './script/deliverScript.bat' 
            }
        }
    }
}