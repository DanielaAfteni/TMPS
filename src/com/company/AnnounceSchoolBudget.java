package com.company;

// class - to send message (1 responsibility)
public class AnnounceSchoolBudget {

    // function to print for the Ministry how much they should invest
    public String fromMinistry (int budget) {
        return "Ministry have to give for School budget " + budget + " lei.";
    }

    // function to print for the school how much they should receive
    public String toSchool (int budget) {
        return "The school budget will receive " + budget + " lei.";
    }
}
