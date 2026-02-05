def call(String url , String branch){
  echo "Cloining the code"
  git "${url}","${branch}"
  echo "Cloining successfull"
}
