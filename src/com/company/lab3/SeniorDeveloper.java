package com.company.lab3;

public class SeniorDeveloper implements IDeveloper {

    @Override
    public void instructions(String sport) {
        if (sport.equalsIgnoreCase("Frontend")) {
            System.out.println("Use the already learned React.");
        } else {
            System.out.println("Use the already learned programming language, and start implementing.");
        }
    }
}
