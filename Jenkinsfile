pipeline
{
    agent any
    environment
    {
        AWS_ACCOUNT_ID="359983627261"
        AWS_DEFAULT_REGION="us-east-1"
        IMAGE_REPO_NAME="jenkins-pipline-build"
        IMAGE_TAG="latest"
        REPOSITORY_URI = "${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/${IMAGE_REPO_NAME}"
    }
    tools
    {
        maven "maven-3.8.5"
    }

    stages
    {

        stage('Cloning Git') {
                    steps {
                        checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '', url: 'https://github.com/Pranavpatel986/Cinema.git']]])
                    }
                }
        stage('Compile and Clean')
        {
            steps
            {
            // Run Maven on a Unix agent.
            sh "mvn clean"
            }
        }

        stage('deploy')
        {
            steps
            {
                sh "mvn install"
            }
        }

        stage('Build Docker Image')
        {
            steps
            {
                script
                {
                  sh 'docker build -t jenkins-pipline-build .'
                }
            }
        }

        stage('Docker Login')
        {
            steps
            {
            //  script {
            //  withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
            //    sh 'docker login -u 705720 -p ${dockerhubpwd}'
            //
            //    sh 'docker push 705720/mydockerrepo4'
            // }
                script
                {
                    sh "aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com"
                }
            }
        }
        stage('Pushing to ECR')
        {
             steps
             {
                 script
                 {
                    sh "docker tag ${IMAGE_REPO_NAME}:${IMAGE_TAG} ${REPOSITORY_URI}:$IMAGE_TAG"
                    sh "docker push ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/${IMAGE_REPO_NAME}:${IMAGE_TAG}"
                 }
            }
        }
    }
}
