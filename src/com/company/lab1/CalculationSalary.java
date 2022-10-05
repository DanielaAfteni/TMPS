package com.company.lab1;

import java.util.List;

public class CalculationSalary {

    // salary - calculate the salary of all the Staff during 1 month
    public int salary(List<Staff> workers) {
        // initially it is set as equal to 0
        int salary = 0;
        for (int i = 0; i < workers.size(); i++){
            Staff worker = workers.get(i);
            // by adding the salary of every worker
            salary += worker.salary();

            // Initially was for just S, but
//            Object worker = workers.get(i);
//            if (worker instanceof Director){
//                salary += ((Director) worker).getHoursWorked() * 200;
//            }
//            if (worker instanceof Teacher){
//                salary += ((Teacher) worker).getNrOfHours() * 300;
//            }
        }
        return salary;
    }
}
