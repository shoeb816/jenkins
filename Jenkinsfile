pipeline {
    agent any //Master-Slave
    stages {
        stage('build'){
            steps {
                sh 'npl install'
            }
        }
		stage('test'){
            steps {
                echo 'Testing APP'
            }
        }
		stage('deploy'){
            steps {
                echo 'Deploying...'
            }
        }
    }    
}
