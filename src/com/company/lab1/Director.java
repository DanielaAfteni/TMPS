package com.company.lab1;

public class Director implements Staff{
    private final int hoursWorked;

    // constructor
    public Director(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    // get the worked hours for a week
    public int getHoursWorked(){
        return hoursWorked;
    }

    // O
    // implement the abstract method
    // get the salary for 1 month
    @Override
    public int salary() {
        return getHoursWorked() * 200;
    }
}
