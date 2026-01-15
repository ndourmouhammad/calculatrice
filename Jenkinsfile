pipeline {
	agent any

	options {
		skipDefaultCheckout(true)
	}

	stages {
		stage('Checkout') {
			steps {
				checkout scm
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
