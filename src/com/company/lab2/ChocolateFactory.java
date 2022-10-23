package com.company.lab2;

public class ChocolateFactory extends AbstractFactory{
    @Override
    public CandyMakerBuilder getBuilder(String whatCandy) {
        CandyMakerBuilder builder = null;

        switch (whatCandy) {
            case "Dark Chocolate":
                builder = new DarkChocolateBuilder();
                break;
            case "White Chocolate":
                builder = new WhiteChocolateBuilder();
                break;
            case "Milk Chocolate":
                builder = new MilkChocolateBuilder();
                break;
            default:
                System.out.println("What is this candy???");
                break;
        }
        return builder;
    }
}
