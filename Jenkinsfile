pipeline {
	agent any
    environment {
		DOCKER_IMAGE_NAME = 'gwrgwr/murilo.ramos'
        DOCKER_CREDENTIALS = 'docker-hub-credentials'
    }
    stages {
		stage('Checkout') {
			steps {
				git(
                    url: 'https://github.com/gwrgwr/technova-common.git'
                )
            }
        }
        stage('Build Docker Image') {
			steps {
				script {
					sh "docker build -t $DOCKER_IMAGE_NAME:${env.BUILD_ID} ."
                }
            }
        }
        stage('Login to Docker Hub') {
			steps {
				script {
					docker.withRegistry('', DOCKER_CREDENTIALS) {
						echo 'Logged in to Docker Hub'
                    }
                }
            }
        }
        stage('Push Docker Image') {
			steps {
				script {
					docker.withRegistry('', DOCKER_CREDENTIALS) {
						sh "docker push $DOCKER_IMAGE_NAME:${env.BUILD_ID}"
                    }
                }
            }
        }
    }
}
