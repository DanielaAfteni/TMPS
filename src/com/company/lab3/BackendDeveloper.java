package com.company.lab3;

public class BackendDeveloper extends Dev {

    BackendDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
        super.setPBLProjectPart("Backend");
    }

    @Override
    public void implement() { System.out.println("The Developer is implementing Back.");}
}