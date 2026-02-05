def call(String String project_name , String image_tag){
  echo "Pushing the ${project_name} image to docker hub"
  withCredentials([
    usernamePassword('credentialsId':"DockerHubCred",
    passwordVariable:"dockerHubPass",
    usernameVariable:"dockerHubUser")]){
      sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
      sh "docker image tag ${env.dockerHubUser}}/${project_name}:${image_tag}"
      sh "docker push ${env.dockerHubUser}/${project_name}:${image_tag}"
    }
  echo "${project_name} image is successfully pushed to docker hub"
}
