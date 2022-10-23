package com.company.lab2;

public class SugarFactory extends AbstractFactory{
    @Override
    public CandyMakerBuilder getBuilder(String whatCandy) {
        CandyMakerBuilder builder = null;

        switch (whatCandy) {
            case "Marshmallow":
                builder = new MarshmallowBuilder();
                break;
            case "Caramel":
                builder = new CaramelBuilder();
                break;
            case "Candy Cane":
                builder = new CandyCaneBuilder();
                break;
            default:
                System.out.println("What is this candy???");
                break;
        }
        return builder;
    }
}
