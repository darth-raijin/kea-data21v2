package com.friday.fridayexercise.services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayCalculator {
    
    boolean isItFriday = false;

    public boolean isItFriday() {

        LocalDate date = LocalDate.now();
        DayOfWeek currentDay = DayOfWeek.from(date);

        if (currentDay.name().equals("FRIDAY")) {
            isItFriday = true;
        }
        
        return isItFriday;
    }
}
