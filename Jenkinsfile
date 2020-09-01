def gv
	
pipeline {
	agent any //Master-Slave
	parameters{
		//string(name:'Version',defaultValue:'',description:'cersion to deploy on prod')
		choice(name:'VERSION',choices:['1.1.0','1.2.0','1.3.0'], description:'')
		booleanParam(name:'executeTests',defaultValue:true, description:'')
		
	
	}
	stages {
		stage("init"){
			steps{
				script{
					gv = load "script.groovy"
				}
			}
		}
		stage('build'){
			steps {
				script{
					gv.buildApp()
				}
			}
		}
		stage('test'){
			when{
				expression{
				params.executeTests == true 
				}
			}
			steps{
				script{
					gv.testApp()
				}
			}
			
		}
		stage('deploy'){
			steps {
				script{
					gv.deployApp()
				}
			}
		}
	}
}
