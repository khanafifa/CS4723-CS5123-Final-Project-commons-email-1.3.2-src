pipeline {
    agent any
    tools {
        maven 'maven-3.6.3' 
    }

    stages {
        stage ('Build Stage') {

            steps {
                withMaven(maven : 'maven-3.6.3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven-3.6.3') {
                    sh 'mvn test'
                }
            }
        }


    }
}