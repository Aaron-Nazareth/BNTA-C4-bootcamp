package com.BntaAaronNazareth.Lessons.CH3_Java_Fundamentals_2.Week2_Wednesday;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WorkingWithDates {
    public static void main(String[] args) {
        LocalDateTime current_UK_DateTime = LocalDateTime.now();
        System.out.println(current_UK_DateTime);

        LocalDate current_UK_date = LocalDate.now();
        System.out.println(current_UK_date);

        LocalTime current_UK_time = LocalTime.now();
        System.out.println(current_UK_time);
    }
}
