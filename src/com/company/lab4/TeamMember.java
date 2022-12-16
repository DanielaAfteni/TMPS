package com.company.lab4;

public class TeamMember extends Jucator {
    @Override
    public void trimiteInstructaj(String instructaj) {
        state.trimiteInstructaj(instructaj);
    }

    @Override
    public void primesteInstructaj(String instructaj) {
        state.primesteInstructaj(instructaj);
    }

    public TeamMember(AntrenorMediator mediator,String surname, String name, String role){
        super(mediator, surname, name, role);
    }
}
