package com.souvik;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2022));


        LocalDate today = LocalDate.now();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int y = input.nextInt();

        System.out.println("Enter your month of birth");
        int m = input.nextInt();

        System.out.println("Enter your date of birth");
        int d = input.nextInt();

        LocalDate birthDate = LocalDate.of(y, m, d);

        int years = Period.between(birthDate,today).getYears();
//        int months = Period.between(birthDate,today).getMonths();

        System.out.println(birthDate);
        System.out.println(years);
//        System.out.println(months);


    }
}
