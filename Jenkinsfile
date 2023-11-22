pipeline {
  agent any
  stages {
    stage('stage1') {
      steps {
        echo 'My first manual Jenkins file'
      }
    }

    stage('Build') {
      steps {
        echo 'Building for Java 8'
        sh 'mvn clean install'
      }
    }

  }
  tools {
    maven 'mvn3'
    jdk 'jdk8'
  }
  environment {
    JAVA_HOME = '${tool \'jdk8\'}'
  }
}