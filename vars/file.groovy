import com.*;

def info(String name){
  TestSrc test= new TestSrc();
  println(test);
  println(test.display(name));
  println("Hello ${name}");
  echo "Hi ${name}"
    
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


}
