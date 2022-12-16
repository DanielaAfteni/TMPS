package com.company.lab4;

public class Venit implements State{
    @Override
    public void trimiteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " a trimis instructajul - '" + instructaj + "'.";
        System.out.println(inst);
        jucator.getMediator().trimiteInstructaj(instructaj, jucator);
    }

    @Override
    public void primesteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " a primit instructajul - '" + instructaj + "'.";
        System.out.println(inst);
    }

    private Jucator jucator;
    public Venit(Jucator jucator) {
        this.jucator = jucator;
    }
}
