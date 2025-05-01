pipeline {
    agent any

    environment {
        ANDROID_HOME = "/path/to/android/sdk"
        PATH = "${env.PATH}:${ANDROID_HOME}/platform-tools:/path/to/node:/path/to/appium"
    }

    tools {
        maven 'Maven_3' // تأكد إن اسم المافن مطابق في Jenkins
    }

    stages {
        stage('Start Appium') {
            steps {
                echo 'Starting Appium Server...'
                sh 'appium --log-level error &'
                sleep 5
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Running Tests with Maven...'
                sh 'mvn clean test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                echo 'Generating Allure Report...'
                sh 'mvn allure:report'
                sh 'mvn allure:serve' // ممكن تشيله لو هتستخدم Jenkins Plugin
            }
        }
    }

    post {
        always {
            echo 'Killing Appium...'
            sh 'pkill -f appium || true'
        }
    }
}
