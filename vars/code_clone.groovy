def call(String url , String branch){
  echo "Cloining the code"
  sh "git ${url},${branch}"
  echo "Cloining successfull"
}
