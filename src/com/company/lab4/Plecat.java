package com.company.lab4;

public class Plecat implements State{

    @Override
    public void trimiteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " nu a venit la antrenament, de aceia nu poate trimite nici un instructaj.";
        System.out.println(inst);
    }

    @Override
    public void primesteInstructaj(String instructaj) {
        String inst = "Jucatorul " + jucator.getSurname() + " " + jucator.getName() +
                    " care este " + jucator.getRole() +
                    " nu a venit la antrenament, de aceia nu poate primi nici un instructaj.";
        System.out.println(inst);
    }

    private Jucator jucator;
    public Plecat(Jucator jucator) { this.jucator = jucator;}
}
