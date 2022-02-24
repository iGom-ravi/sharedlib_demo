package com;

public class TestSrc{
 public TestSrc(){
  print("Inside Const")
 }
  public String display(String name){
    if ("${name}" == "Clean")
                    {
                     bat "mvn clean"
                    }
              else if ("${name}" == "Compile")
                    {
                    bat "mvn clean compile"
                    }
               else if ("${name}" == "Test")
                    {
                    bat "mvn clean test"
                    }
                 else if ("${name}" == "Install")
                    {
                    bat "mvn clean install"
                    }
             return "im returing ${name}"
  }
}
