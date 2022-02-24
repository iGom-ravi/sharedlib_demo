import com.*;

def info(String name){
  TestSrc test= new TestSrc();
  println(test);
  println(test.display(name));
  println("Hello ${name}");
  echo "Hi ${name}"
    
       if ("${name}" == "Clean")
                    {
                     print("mvn clean")
                    }
              else if ("${name}" == "Compile")
                    {
                    print("mvn clean compile")
                    }
               else if ("${name}" == "Test")
                    {
                    print("mvn clean test")
                    }
                 else if ("${name}" == "Install")
                    {
                    print("mvn clean install")
                    }


}
