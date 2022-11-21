package com.company.lab3;

public class DevBuilder {
    void build(String pblProject, String seniorOrJunior) {
        if (pblProject.equalsIgnoreCase("Frontend") || pblProject.equalsIgnoreCase("Backend"))
        {
            DevAdapter devAdapter = new DevAdapter(pblProject, seniorOrJunior);
            devAdapter.implementPBLProject();
        } else {
            System.out.println("This PBL project does not include this part.");
        }
    }
}
