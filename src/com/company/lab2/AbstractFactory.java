package com.company.lab2;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractFactory {
    public static Map<String, CandyMaker> prototypes = new HashMap<>();

    public static CandyMaker getPrototype (String typeOfCandy) {
        try {
            return prototypes.get(typeOfCandy).clone();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract CandyMakerBuilder getBuilder(String whatCandy);

}
