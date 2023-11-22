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
        echo 'This is an update'
      }
    }

    stage('Build') {
      steps {
        sh '''echo \'Attempting first build\'
sh \'mvn clean install\''''
      }
    }

  }
}
