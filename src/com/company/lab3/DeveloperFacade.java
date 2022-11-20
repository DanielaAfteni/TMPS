package com.company.lab3;

public class DeveloperFacade {
    private IDeveloper juniorDeveloper;
    private IDeveloper seniorDeveloper;
    private String pblProject;

    public String getPblProject() {
        return pblProject;
    }

    public DeveloperFacade() {
        this.seniorDeveloper = new SeniorDeveloper();
        this.juniorDeveloper = new JuniorDeveloper();
    }

    public void stepsForSeniors(String pblProject) {
        this.seniorDeveloper.instructions(pblProject);
    }

    public void stepsForJuniors(String pblProject) {
        this.juniorDeveloper.instructions(pblProject);
    }
}
