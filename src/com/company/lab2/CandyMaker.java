package com.company.lab2;

public class CandyMaker {
    // 4 attributes and the get and set methods
    private String name = "";
    private String surname = "";
    private String typeOfCandy = "";
    private String whatCandy = "";

    // prototype
    //  return a clone of the object
    public CandyMaker clone() {
        CandyMaker newCandyMakerClone = new CandyMaker();
        newCandyMakerClone.typeOfCandy = this.typeOfCandy;
        return newCandyMakerClone;
    }

    void setName (String name) {
        this.name = name;
    }

    void setSurname (String surname) { this.surname = surname; }

    void setTypeOfCandy (String typeOfCandy) { this.typeOfCandy = typeOfCandy; }

    void setWhatCandy (String whatCandy) {
        this.whatCandy = whatCandy;
    }

    String getName() {
        return this.name;
    }

    String getSurname() {
        return this.surname;
    }

    String getTypeOfCandy() {
        return this.typeOfCandy;
    }

    String getWhatCandy() {
        return this.whatCandy;
    }
}
