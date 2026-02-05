def call(String dockerHubUser , String ProjectName , String image_name){
  echo "Building the docker iamge"
  sh "sudo docker build -t ${dockerHubUser}/${ProjectName}:${image_name} ."
  echo "docker image build successfully"
}
