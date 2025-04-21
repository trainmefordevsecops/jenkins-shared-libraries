def call(String jobname) {

    echo "Running job: ${jobname}"
    dir("${env.WORKSPACE}") {
        sh 'npm install'
        sh 'npm run build'
    }

} 
