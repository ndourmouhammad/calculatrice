pipeline {
	agent any

	stages {
		stage('Clean workspace') {
			steps {
				deleteDir()
			}
		}

		stage('Checkout') {
			steps {
				git url: 'https://github.com/ndourmouhammad/calculatrice.git',
				branch: 'main'
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
