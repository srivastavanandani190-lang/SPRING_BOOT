package org.example;

public class Main {
    public static void main(String[] args) {
              System.out.println("Hello World");
    }
}
//intellij compiles the code
//Maven has 3 lifecycles:
//
//Clean Lifecycle → Cleans previous build files (mvn clean)
//Default Lifecycle → Builds and deploys the project (validate → compile → test → package → verify → install → deploy)
//Site Lifecycle → Generates project documentation (mvn site)