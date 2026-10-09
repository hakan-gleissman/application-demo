package se.sprinto.hakan.application;

import java.util.random.RandomGenerator;

public class CodeGenerator implements CodeGeneratorInterface {
    @Override
    public int getCode() {
        return RandomGenerator.getDefault().nextInt(1, 7);
    }
}
