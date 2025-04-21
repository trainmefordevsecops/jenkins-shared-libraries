def call() {

    dir("${env.WORKSPACE}") {
        sh './gradlew clean build'
    }

} 
