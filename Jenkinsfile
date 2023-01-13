pipeline {
       agent any
        stages{
            stage('Checkout GIT'){
                steps{
                    echo 'Pulling...';
                    git branch: 'main',
                 
                    url : 'https://github.com/HajerBenYahia/backend.git';
                             }
                             }

            stage('MVN CLEAN')
            {
                steps{
                sh  'mvn clean'
                }
            }
            stage('MVN COMPILE')
            {
                steps{
                sh  'mvn compile'
                }
            }
            stage('MVN PACKAGE'){
                          steps{
                              sh  'mvn package'
                          }
                    }
                           stage('MVN Test'){
                                              steps{
                                                  sh  'mvn test'
                                              
                                        }
                           }
                             

                    stage('Build docker image'){
                                                 steps{
                                                     script{
                                                        sh 'docker build -t hajerbenyahia/springproject .'
                                                     }
                                                 }
                                             }

                                              stage('Docker login') {

                                                        steps {
                                                                    sh 'echo "login Docker ...."'
                                                                	sh 'docker login -u hajerbenyahia -p hajer1234'
                                                                 }  }


          stage('Docker push') {

                           steps {
                                sh 'echo "Docker is pushing ...."'
                               	sh 'docker push hajerbenyahia/springproject'
                                  }  }

                              /*       stage('Docker compose') {

                          steps {
                               sh 'docker-compose up -d'
                                 }*/  }







	

}
