def buildApp(){
    echo 'Building...'
}

def testApp(){
    echo 'Testing the application...'
}

def deployApp(){
    echo 'Deploying...'
		echo "deployment version ${params.VERSION}"
}

return this
