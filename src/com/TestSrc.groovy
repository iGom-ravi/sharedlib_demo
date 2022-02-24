package com;

public class TestSrc{
 public TestSrc(){
  print("Inside Const")
 }
  public String display(String name){
    if ("${name}" == "Clean")
                    {
                     sh "mvn clean"
                    }
              else if ("${name}" == "Compile")
                    {
                    sh "mvn clean compile"
                    }
               else if ("${name}" == "Test")
                    {
                    sh "mvn clean test"
                    }
                 else if ("${name}" == "Install")
                    {
                    sh "mvn clean install"
                    }
             return "im returing ${name}"
  }
}
