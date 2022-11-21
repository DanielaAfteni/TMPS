package com.company.lab3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
         // The main idea is based on the PBL project
         // Each PBL group has its members, where each of them should have a:
         // Status:
         //         Frontend Developer
         //         Backend Developer
         // Experience:
         //              Junior
         //              Senior

         // Each of the PBL groups has its leader, which anyway is as well a junior/senior developer at Frontend/Backend

         // Each developer has its name, surname, status, experience and group(of other members)
         // Bridge
         // Decorator
         // Start of the implementation
         Developer developer1 = new Leader(new BackendDeveloper(new JuniorDeveloper()));
         Developer developer2 = new FrontendDeveloper(new SeniorDeveloper());
         System.out.println(developer2.printInfoAboutDeveloper());
         System.out.println(developer1.printInfoAboutDeveloper());
         developer2.implement();
         developer1.implement();
         // Facade
         DeveloperFacade playerFacade = new DeveloperFacade();
         playerFacade.stepsForSeniors("Frontend");
         playerFacade.stepsForJuniors("Backend");
         // Adapter
         DevBuilder devBuilder = new DevBuilder();
         devBuilder.build("frontend", "junior");
         devBuilder.build("backend", "junior");
         devBuilder.build("frontend", "senior");
         devBuilder.build("backend", "senior");
         // Composite
         Dev dev1 = new Dev(new JuniorDeveloper());
         dev1.setDeveloperSurname("Tifin");
         dev1.setDeveloperName("Maria");
         dev1.setSeniorOrJunior("junior");
         dev1.setPBLProjectPart("Frontend");
         Dev dev2 = new Dev(new SeniorDeveloper());
         dev2.setDeveloperSurname("Crocodel");
         dev2.setDeveloperName("Valeria");
         dev2.setSeniorOrJunior("senior");
         dev2.setPBLProjectPart("Backend");
         Dev dev3 = new Dev(new SeniorDeveloper());
         dev3.setDeveloperSurname("Miricinschi");
         dev3.setDeveloperName("Nicoleta");
         dev3.setSeniorOrJunior("senior");
         dev3.setPBLProjectPart("Frontend");
         Dev dev4 = new Dev(new SeniorDeveloper());
         dev4.setDeveloperSurname("Gologan");
         dev4.setDeveloperName("Roman");
         dev4.setSeniorOrJunior("senior");
         dev4.setPBLProjectPart("Backend");
         dev4.addTeammate(dev1);
         dev4.addTeammate(dev2);
         dev4.addTeammate(dev3);
         DevList seniorDevelopers = new SeniorDevelopers();
         List<Dev> seniors = seniorDevelopers.determineBestSeniors(dev4.getGroupMembers());
         for (Dev senior : seniors) {System.out.println(senior.printInfoAboutDeveloper());}
    }
}