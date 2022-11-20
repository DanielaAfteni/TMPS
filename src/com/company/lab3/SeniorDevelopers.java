package com.company.lab3;


import java.util.ArrayList;
import java.util.List;

public class SeniorDevelopers implements DevList {

    @Override
    public List<Dev> determineBestSeniors(List<Dev> devList) {
        List<Dev> seniorDevelopers = new ArrayList<>();
        for (Dev dev : devList) {
            if (dev.getSeniorOrJunior().equalsIgnoreCase("senior")) {seniorDevelopers.add(dev);}
        }
        return seniorDevelopers;
    }
}
