pipeline {
	agent any

	stages {
		stage('Checkout') {
			steps {
				git branch: 'main', url: 'https://github.com/ndourmouhammad/calculatrice.git'
			}
		}

		stage('Build & Test (Docker)') {
			steps {
				sh 'docker build -t calculatrice-test .'
				sh 'docker run --rm calculatrice-test'
			}
		}
	}
}