package com.company.lab3;

public class DevAdapter extends Dev {
    private Dev dev;

    DevAdapter(String pblProject, String seniorOrJunior) {
        if (pblProject.equalsIgnoreCase("Frontend"))
        {
            dev = new FrontendDeveloper(seniorOrJunior.equalsIgnoreCase("senior") ? new JuniorDeveloper() : new SeniorDeveloper());
        } else {
            dev = new BackendDeveloper(seniorOrJunior.equalsIgnoreCase("senior") ? new JuniorDeveloper() : new SeniorDeveloper());
        }
    }

    void implementPBLProject() {dev.implement();}
}
