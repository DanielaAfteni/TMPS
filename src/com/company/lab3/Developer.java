package com.company.lab3;

public abstract  class Developer {
    protected IDeveloper iDeveloper;
    public Developer() {}

    public Developer(IDeveloper iDeveloper) {
        this.iDeveloper = iDeveloper;
    }
    abstract void implement();
    abstract void instructions();
    abstract String printInfoAboutDeveloper();
}
