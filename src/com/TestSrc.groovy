package com;

public class TestSrc{
 public TestSrc(){
  print("Inside Const")
 }
  public String display(String name){
    if ("${name}" == "Clean")
                    {
                     print( "mvn clean")
                    }
              else if ("${name}" == "Compile")
                    {
                    print(  "mvn clean compile")
                    }
               else if ("${name}" == "Test")
                    {
                    print(  "mvn clean test")
                    }
                 else if ("${name}" == "Install")
                    {
                    print(  "mvn clean install")
                    }
             return "im returing ${name}"
  }
}
