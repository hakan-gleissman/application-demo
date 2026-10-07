package se.sprinto.hakan.application;

import java.util.random.RandomGenerator;

public class CodeGenerator {

    public static int getCode() {
        return RandomGenerator.getDefault().nextInt(1, 7);
        //return code;
    }
}
