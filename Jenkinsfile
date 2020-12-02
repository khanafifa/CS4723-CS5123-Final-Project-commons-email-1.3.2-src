pipeline {
    agent any
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
                bat './script/deliverScript.bat' 
            }
        }
    }
}
