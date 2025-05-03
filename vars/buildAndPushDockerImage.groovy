#!/usr/bin/env/groovy

def call() {
    echo "building the docker image"
    withCredentials([usernamePassword(credentialsId: "docker-hub-repo", passwordVariable: 'PASS', usernameVariable: "USER" )]){
    sh 'docker build -t arnoldkibira/simple-java-maven-app:1.2 .'
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh "docker push arnoldkibira/simple-java-maven-app:1.2"
    }
}