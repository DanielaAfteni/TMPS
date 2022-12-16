package com.company.lab4;

import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;
import java.util.ArrayList;

public class TeamAntrenor implements AntrenorMediator, Iterable<Jucator>{
    @Override
    public void trimiteInstructaj(String instructaj, Jucator jucator) {
        for (Jucator jucator1 : jucators) {
            if (jucator1 != jucator) {jucator1.primesteInstructaj(instructaj);}
        }
    }
    @Override
    public Iterator<Jucator> iterator() {
        return jucators.iterator();
    }

    @Override
    public void inscriereaUnuiJucator(Jucator jucator) {
        jucators.add(jucator);
    }

    private List<Jucator> jucators;
    public TeamAntrenor(){
        jucators = new ArrayList<>();
    }
}
