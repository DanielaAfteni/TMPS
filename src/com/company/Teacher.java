package com.company;

public class Teacher implements Staff{
    private final int nrOfHours;

    // constructor
    public Teacher(int nrOfHours){
        this.nrOfHours = nrOfHours;
    }

    // get the worked hours for a week
    public int getNrOfHours(){
        return nrOfHours;
    }

    // O
    // implement the abstract method
    // get the salary for 1 month
    @Override
    public int salary() {
        return getNrOfHours() * 300;
    }
}
