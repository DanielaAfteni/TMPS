package com.company.lab3;

public class FrontendDeveloper extends Dev {

    FrontendDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
        super.setPBLProjectPart("Frontend");
    }

    @Override
    public void implement() {
        System.out.println("The Developer is implementing Front.");
    }
}
