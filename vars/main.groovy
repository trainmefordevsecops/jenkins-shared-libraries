def call(String jobname) {

    echo "Running job: ${jobname}"
    dir("${env.WORKSPACE}") {
        sh 'chmod +x ./gradlew'
        sh './gradlew clean build'
    }

} 
