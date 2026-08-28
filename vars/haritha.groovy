def download(repo)
{
        git "https://github.com/IntelliqDevops/${repo}.git"
}
def build()
{
        sh "mvn package"
}
def deploy(jobname,ip,context)
{
        sh "scp /var/lib/jenkins/workspace/sharedlibraryscripted/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def testing()
{
         sh "java -jar /var/lib/jenkins/workspace/sharedlibraryscripted/testing.jar"
}
