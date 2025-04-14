pipeline {
	agent any
    environment {
		DOCKER_IMAGE_NAME = 'gwrgwr/murilo.ramos'
        DOCKER_CREDENTIALS = 'docker-hub-credentials'
        GIT_CREDENTIALS = 'git-ssh-credentials'
    }
    stages {
		stage('Checkout') {
			steps {
                git credentialsId: GIT_CREDENTIALS, url: 'git@github.com:gwrgwr/technova-common.git'
            }
        }
        stage('Build Docker Image') {
			steps {
				script {
					sh 'docker build -t $DOCKER_IMAGE_NAME:${env.BUILD_ID} .'
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
						sh 'docker push $DOCKER_IMAGE_NAME:${env.BUILD_ID}'
                    }
                }
            }
        }
    }
}
