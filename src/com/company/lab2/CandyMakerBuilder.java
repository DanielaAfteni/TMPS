package com.company.lab2;

public abstract class CandyMakerBuilder {
    private CandyMaker candyMaker;

    public CandyMaker getCandyMaker() {
        return candyMaker;
    }

    public CandyMakerBuilder() {
        candyMaker = new CandyMaker();
    }

    void addName (String name) {
        candyMaker.setName(name);
    }

    void addSurname (String surname) {
        candyMaker.setSurname(surname);
    }

    void addTypeOfCandy (String typeOfCandy) {
        candyMaker.setTypeOfCandy(typeOfCandy);
    }

    void addWhatCandy (String whatCandy) {
        candyMaker.setWhatCandy(whatCandy);
    }

    public abstract String getInfoAboutWhatCandy();
}
