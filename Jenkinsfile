pipeline {
    agent any
    tool maven: 'maven-3.6.3', type: 'maven'

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
