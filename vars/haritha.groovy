def download(repo)
{
        git 'https://github.com/IntelliqDevops/${repo}.git'
}
def build()
{
        sh 'mvn package'
}
def deploy(jobname,ip,context)
{
        sh 'scp /home/ubuntu/haritha/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war'
}
def testing()
{
         sh 'java -jar /home/ubuntu/haritha/workspace/scriptedpipelineonslave/testing.jar'
}
