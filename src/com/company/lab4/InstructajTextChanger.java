package com.company.lab4;

import java.util.Locale;

public class InstructajTextChanger implements InstructajChanger {
    @Override
    public String changeTheInstructaj(String instructaj) {
        return instructaj.toUpperCase();
    }
}
