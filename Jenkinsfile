pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage ('Deploy to Staging'){
            steps {
                build job: 'Deploy_to_Staging_MVC_Classick'
            }
        }

        stage ('Deploy to Production'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'Approve PRODUCTION Deployment?'
                }
                build job: 'Deploy_to_Staging_MVC_Classick'
            }
            post {
                success {
                    echo 'Code deployed to Production.!!!!!'
                }
                failure {
                    echo ' Deployment failed.'
                }
            }
        }
    }
}
