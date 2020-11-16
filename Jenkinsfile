
pipeline {
    agent any
    
    stages {
        stage('Build Stage') { 
            steps {
            withMaven(maven: 'maven_3.6.3'){
            	 sh 'mvn -B -DskipTests clean package' 
            }
               
            }
        }
    }
}