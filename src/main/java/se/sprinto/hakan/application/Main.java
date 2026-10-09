package se.sprinto.hakan.application;

import java.util.random.RandomGenerator;

public class Main {

    static void main() {

        CodeGenerator codeGenerator = new CodeGenerator();
        //FakeCodeGenerator fakeCodeGenerator = new FakeCodeGenerator();
        Application application = new Application(codeGenerator);
        //kod
        application.startApplication();
        int code = application.getCodeFromGenerator(() -> RandomGenerator.getDefault().nextInt(1, 7));
        IO.println("Koden från metoden getCodeFromGenerator(): " + code);

    }
}
