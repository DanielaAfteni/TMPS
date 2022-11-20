package com.company.lab3;

public class Leader extends DeveloperDecorator {
    public Leader(Dev player) {
        super(player);
    }

    @Override
    public void implement() {
        super.developer.implement();
    }

    @Override
    public void instructions() {
        super.developer.instructions();
    }

    @Override
    public String printInfoAboutDeveloper() {return "Leader of the PBL project: " + super.developer.printInfoAboutDeveloper();}
}