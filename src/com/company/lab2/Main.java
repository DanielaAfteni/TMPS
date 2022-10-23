package com.company.lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        while (true) {
            // We will create a factory for sweets
            // This factory is going to be of 2 kinds:
            //                                          Sugar factory
            //                                          Chocolate factory
            // At each of these factories will work candy makers (like cooks)
            // Considering that we have 2 types of sweets, then it means that we have different candies

            // At Sugar factory:
            //                  Caramel
            //                  Candy Cane
            //                  Marshmallow

            // At Chocolate factory:
            //                      White Chocolate
            //                      Dark Chocolate
            //                      Milk Chocolate

            // Each candy maker(cook) will be assigned to a specific type of candy and a specific candy

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("\nWrite the type of the candy of the current candy maker: ");
                String typeOfCandy = br.readLine();
                if (typeOfCandy.length() == 0) break;
                System.out.println(AbstractFactory.prototypes.isEmpty());

                System.out.println("\nWrite the name and surname of the current candy maker: ");
                String name = br.readLine();
                String surname = br.readLine();

                System.out.println("\nWrite what candy the candy maker will make: ");
                String whatCandy = br.readLine();
                CandyMaker prototype = AbstractFactory.getPrototype(typeOfCandy);
                // In case if a prototype is found it will be cloned
                if (prototype != null) {

                    System.out.println("The prototype was found for this type of candy!");
                    prototype.setName(name);
                    prototype.setSurname(surname);
                    prototype.setWhatCandy(whatCandy);
                    continue;
                }
                FactoryCreator creator = FactoryCreator.getInstance();
                // We will create a factory for sweets

                AbstractFactory candyMakerFactory = creator.getFactory(typeOfCandy);
                // This factory is going to be of 2 kinds:
                //                                          Sugar factory
                //                                          Chocolate factory
                CandyMakerBuilder builder = candyMakerFactory.getBuilder(whatCandy);
                // At Sugar factory:
                //                  Caramel
                //                  Candy Cane
                //                  Marshmallow

                // At Chocolate factory:
                //                      White Chocolate
                //                      Dark Chocolate
                //                      Milk Chocolate
                builder.addName(name);
                builder.addSurname(surname);
                builder.addTypeOfCandy(typeOfCandy);
                builder.addWhatCandy(whatCandy);
                // Each candy maker(cook) will be assigned to a specific type of candy and a specific candy
                System.out.println(AbstractFactory.prototypes.put(typeOfCandy, builder.getCandyMaker()));
                System.out.println(builder.getInfoAboutWhatCandy());
        } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
