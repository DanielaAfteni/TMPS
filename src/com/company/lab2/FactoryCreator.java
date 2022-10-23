package com.company.lab2;

public final class FactoryCreator {
    // Singletone
    private static FactoryCreator instance;

    private FactoryCreator() {};

    public static synchronized FactoryCreator getInstance() {
        if (instance == null) {
            instance = new FactoryCreator();
        }
        return instance;
    }

    public AbstractFactory getFactory(String typeOfCandy) {
        AbstractFactory factory = null;
        switch (typeOfCandy) {
            case "Sugar":
                factory = new SugarFactory();
                break;
            case "Chocolate":
                factory = new ChocolateFactory();
                break;
            default:
                System.out.println("What type is this candy?");
                break;
        }
        return factory;
    }
}
