pipeline {
    agent any //Master-Slave
	stages {
		stage('build'){
			steps {
				sh 'mvn install'
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
