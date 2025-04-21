def call(jobname) {

    echo "Running job: ${jobname}"
    dir("${env.WORKSPACE}") {
        sh './gradlew clean build'
    }

} 
