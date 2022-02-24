@Library('jenkins')_
 pipeline{
 agent any
 tools{
    jdk 'JDK'
    maven 'maven'
}
 stages{
 stage ('Clone') {
    steps {
        git url: "https://github.com/javabycode/spring-boot-maven-example-helloworld.git"
        }
    }
 stage('demo')
 {
 steps{
 script{
//welcome.info("ramesh")
 file.info("Clean")
 }
 }
 }

 }
 }
 
