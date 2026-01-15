pipeline {
	agent any

	stages {
		stage('Build & Test (Docker)') {
			steps {
				sh 'docker build -t calculatrice-test .'
				sh 'docker run --rm calculatrice-test'
			}
		}
	}
}
