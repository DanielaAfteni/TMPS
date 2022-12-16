package com.company.lab4;

public abstract class Jucator {
    protected String surname;
    protected String name;
    protected String role;
    protected State state;
    protected AntrenorMediator mediator;

    public Jucator(AntrenorMediator mediator, String surname, String name, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.state = new Plecat(this);
        this.mediator = mediator;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getRole() {
        return this.role;
    }

    public String getState() {
        return this.state.getClass().getSimpleName();
    };

    public AntrenorMediator getMediator() {
        return this.mediator;
    };

    public void aVenit() {
        this.state = new Venit(this);
    };
    public void aPlecat() {
        this.state = new Plecat(this);
    };

    public abstract void trimiteInstructaj(String instructaj);
    public abstract void primesteInstructaj(String instructaj);
}
