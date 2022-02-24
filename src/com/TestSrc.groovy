package com;

public class TestSrc{
 public TestSrc(){
  print("Inside Const")
 }
  public String display(String name){
    if ("${name}" == "Test")
                    {
                     return  "mvn clean"
                    }
              else if ("${name}" == "Compile")
                    {
                    return   "mvn clean compile"
                    }
               else if ("${name}" == "Test1")
                    {
                    return   "mvn clean test"
                    }
                 else if ("${name}" == "Install")
                    {
                    return   "mvn clean install"
                    }
            return "hy im not working"
  }
}
