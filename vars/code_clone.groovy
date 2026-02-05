def call(String url , String branch){
  echo "Cloining the code"
  git url:"${url}",branch:"${branch}"
  echo "Cloining successfull"
}
