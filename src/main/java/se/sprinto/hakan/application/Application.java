package se.sprinto.hakan.application;

public class Application {
    private CodeGeneratorInterface codeGenerator;

    public Application(CodeGeneratorInterface codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void startApplication() {
        //entry point för applikationen
        IO.println(codeGenerator.getCode());


    }


}
