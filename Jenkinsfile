pipeline {
    agent any
    environment{
    	PATH = "C:/Program Files/apache-maven-3.6.3/bin:$PATH"
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
                bat './script/deliverScript.bat' 
            }
        }
    }
}
