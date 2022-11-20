package com.company.lab3;

public class DevBuilder {
    void build(String pblProject, String seniorOrJunior) {
        if (pblProject.equalsIgnoreCase("Frontend") || pblProject.equalsIgnoreCase("Backend"))
        {
            DevAdapter playerAdapter = new DevAdapter(pblProject, seniorOrJunior);
            playerAdapter.implementPBLProject();
        } else {
            System.out.println("This PBL project does not include this part.");
        }
    }
}
