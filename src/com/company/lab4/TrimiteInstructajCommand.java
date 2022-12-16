package com.company.lab4;

public class TrimiteInstructajCommand implements Command{
    @Override
    public void executareaInstructajlui() {
        String changedInstructaj = instructajChanger.changeTheInstructaj(instructaj);
        mediator.trimiteInstructaj(changedInstructaj, jucator);
    }

    @Override
    public void setSuplimentarAntrenatJucator(InstructajChanger instructajChanger) {
        this.instructajChanger = instructajChanger;
    }
    private String instructaj;
    private Jucator jucator;
    private AntrenorMediator mediator;
    private InstructajChanger instructajChanger;

    public TrimiteInstructajCommand(AntrenorMediator mediator, String instructaj, Jucator jucator) {
        this.jucator = jucator;
        this.mediator = mediator;
        this.instructaj = instructaj;
    }
}
