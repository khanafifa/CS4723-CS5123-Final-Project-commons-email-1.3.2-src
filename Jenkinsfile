pipeline {
    agent any
        tools {
        maven 'apache-maven-3.6.3' 
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build Stage') {
            steps {
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test Stage') { 
            steps {
                bat 'mvn test' 
            }
        }
        stage('Deliver') { 
            steps {
                bat './scripts/deliverScript.bat' 
            }
        }
    }
}
