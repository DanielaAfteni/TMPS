package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Single Responsibility Principle (S)

        // Each class - should have only one purpose
        //            - not be filled with excessive functionally


        // Open Closed Principle (O)

        // Classes - should be open for extension
        //         - not open for modification
        //         - should not be rewritten for implementing new functions
        // Use Interfaces, with that function


        // The next situation:
        // We have to:
        //             calculate the school budget to pay the staffs' salaries
        //             send to the ministry and school the message about school budget

	    CalculationSalary calculationSalary = new CalculationSalary();
        Director director = new Director(40);
        Teacher teacher = new Teacher(25);
        // O
        AuxiliaryStaff auxiliaryStaff = new AuxiliaryStaff();
        SchoolBudgetCalculation schoolBudgetCalculation = new SchoolBudgetCalculation();
        AnnounceSchoolBudget announceSchoolBudget = new AnnounceSchoolBudget();
//        List<Object> workers = List.of(director, teacher);
        // O
        // we have a list of workers:
        List<Staff> workers = List.of(director, teacher, auxiliaryStaff);
        // salary - calculate the salary of all the Staff during 1 month
        int salary = calculationSalary.salary(workers);
        // budget - calculate the school budget of the school to pay the staffs' salary for 1 year
        int budget = schoolBudgetCalculation.budgetCalculation(salary);
        // print for the Ministry and to the school how much they should invest and receive
        System.out.println(announceSchoolBudget.fromMinistry(budget));
        System.out.println(announceSchoolBudget.toSchool(budget));
    }
}
