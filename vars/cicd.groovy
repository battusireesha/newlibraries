def gitdwnld(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}

def mavenbuild()
{
  sh 'mvnpackage'
}

def tomcatdeploy(jobname,ip,context)
{


}

def runselenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}.testing.jar"
}

  
