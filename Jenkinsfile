pipeline {
	agent any //Master-Slave
	parameters{
		//string(name:'Version',defaultValue:'',description:'cersion to deploy on prod')
		choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'], description:'')
		boleanParam(name:'executeTests',defaultValue:true, description:'')
		
	
	}
	stages {
		stage('build'){
			steps {
				echo 'Building...'
				//sh 'mvn install'
			}
		}
		stage('test'){
			when{
				expression{
				params.executeTests == true 
				}
			}
			steps {
				echo 'Testing APP'
			}
		}
		stage('deploy'){
			steps {
				echo 'Deploying...'
				echo "deployment version ${params.VERSION}"
			}
		}
	}
}
