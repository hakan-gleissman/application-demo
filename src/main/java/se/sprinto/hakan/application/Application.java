package se.sprinto.hakan.application;

import java.util.random.RandomGenerator;

public class Application {
    private CodeGeneratorInterface codeGenerator;

    public Application(CodeGeneratorInterface codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    public void startApplication() {
        //anonym klass - skapas direkt i programflödet, ingen separat fil
        CodeGeneratorInterface codeGeneratorInterface = new CodeGeneratorInterface() {
            @Override
            public int getCode() {
                return RandomGenerator.getDefault().nextInt(100, 1000);
            }
        };
        int code = codeGeneratorInterface.getCode();
        IO.println("Koden från den anonyma klassen är: " + code);
        //implementation med lambda - skapas också direkt i programflödet
        //funkar endast när interfacet har en enda abstrakt metod
        CodeGeneratorInterface codeGen = () -> RandomGenerator.getDefault().nextInt(1, 11);

        int code2 = codeGen.getCode();

        IO.println("Koden från lambda-implementationen är:" + code2);


    }

    public int getCodeFromGenerator(CodeGeneratorInterface codeGenerator) {
        return codeGenerator.getCode();
    }


}
