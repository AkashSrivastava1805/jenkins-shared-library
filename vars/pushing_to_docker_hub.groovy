def call(String docker_user, String project_name, String image_tag) {
  echo "Pushing the ${project_name} image to Docker Hub"

  withCredentials([
    usernamePassword(
      credentialsId: 'DockerHubCred',
      usernameVariable: 'dockerHubUser',
      passwordVariable: 'dockerHubPass'
    )
  ]) {
    sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'

    sh "docker push ${docker_user}/${project_name}:${image_tag}"
  }

  echo "${project_name} image successfully pushed to Docker Hub"
}
