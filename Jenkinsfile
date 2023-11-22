pipeline {
  agent any
  tools {
    maven 'mvn3'
    jdk 'JDK11'
  }
  stages {
    stage('stage1') {
      steps {
        echo 'My first manual Jenkins file'
      }
    }

    stage('Build') {
      steps {
        echo 'Attempting to not fail the build'
        sh 'mvn clean install'
      }
    }

  }
}
