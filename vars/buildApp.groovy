#!/usr/bin/env/groovy

def call() {
    echo 'building the application'
    sh 'mvn -B -DskipTests clean package'

}