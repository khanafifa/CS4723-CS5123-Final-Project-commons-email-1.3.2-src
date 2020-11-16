pipeline {
    agent any

    stages {
        stage ('Build Stage') {

            steps {
                def mvnhome = tool maven: 'maven-3.6.3', type: 'maven'
                    sh "{mvnhome}/bin/mvn clean compile"
                
            }
        }


    }
}
