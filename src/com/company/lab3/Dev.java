package com.company.lab3;

import java.util.ArrayList;
import java.util.List;

public class Dev extends Developer {
    private String developerName;
    private String developerSurname;
    private List<Dev> groupMembers;
    private String seniorOrJunior;
    private String pblProject;

    Dev() {}

    Dev(IDeveloper playerAPI) {
        super(playerAPI);
        groupMembers = new ArrayList<Dev>();
    }

    void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }
    String getDeveloperName() {
        return this.developerName;
    }

    void setDeveloperSurname(String developerSurname) {
        this.developerSurname = developerSurname;
    }
    String getDeveloperSurname() {
        return this.developerSurname;
    }

    void setSeniorOrJunior(String seniorOrJunior) {
        this.seniorOrJunior = seniorOrJunior;
    }
    String getSeniorOrJunior() {
        return this.seniorOrJunior;
    }

    void setPBLProjectPart(String PBLProjectPart) {
        this.pblProject = PBLProjectPart;
    }
    String getPblProjectPart() {
        return this.pblProject;
    }

    List<Dev> getGroupMembers() {
        return this.groupMembers;
    }
    void addTeammate(Dev player) { this.groupMembers.add(player); }
    void removeTeammate(Dev player) { this.groupMembers.remove(player); }

    @Override
    public void implement() {
        System.out.println("He is implementing.");
    }

    @Override
    public String printInfoAboutDeveloper() {
        return  developerSurname + " " + developerName
                + " is a " + seniorOrJunior
                + " developer at the " + pblProject
                + " in the PBL project.";
    }

    @Override
    void instructions() {
        iDeveloper.instructions(pblProject);
    }
}