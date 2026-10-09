package se.sprinto.hakan.application;

public class Main {

    static void main() {

        CodeGenerator codeGenerator = new CodeGenerator();
        //FakeCodeGenerator fakeCodeGenerator = new FakeCodeGenerator();
        Application application = new Application(codeGenerator);
        //kod
        application.startApplication();


    }
}
