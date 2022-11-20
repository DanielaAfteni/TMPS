package com.company.lab3;

public class JuniorDeveloper implements IDeveloper {

    @Override
    public void instructions(String sport) {
        if (sport.equalsIgnoreCase("Frontend")) {
            System.out.println("Inform yourself about React, and try to learn it.");
        } else {
            System.out.println("Inform yourself about any language, and try to learn it how to implement backend.");
        }
    }
}
