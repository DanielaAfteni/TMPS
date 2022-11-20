package com.company.lab3;

public abstract class DeveloperDecorator extends Developer {
    Developer developer;
    DeveloperDecorator(Dev player) {
        this.developer = player;
    }

    @Override
    public String printInfoAboutDeveloper() {
        return this.developer.toString();
    }
}
