package com.estyseesghosts.reviewexercises5;

public class DayNumber {
    public static void main () {
        System.out.println(dayNumber(2004, 3, 1));
        System.out.println(dayNumber(2002, 1, 1));
        System.out.println(dayNumber(2007, 12, 31));
        System.out.println(dayNumber(2011, 3, 1));
        System.out.println(dayNumber(2010, 15, 6));
    }

    public static int dayNumber(int year, int month, int days) {
        if (year <= 0) return 0;
        else if (month <= 0 || month > 12) return 0;
        else if (days <= 0 || days > 31) return 0;
        else {
            int numberOfDays = 0;
            for (int i = month; i >= 1; i--) {
                if (i == 2 && isLeapYear(year)) numberOfDays += numberOfDays(i) + 1; // accomodates for feb in a leap year
                else numberOfDays += numberOfDays(i); // adds the number of days up to the end of the current month
            }

            numberOfDays = numberOfDays - numberOfDays(month) + days; // subtracts the current month then adds back how many days elapsed
            return numberOfDays;
        }
    }

    public static int numberOfDays(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: return 31;
            case 4, 6, 9, 11: return 30;
            case 2: return 28; // leap years are accomodated for in the other method
        }
        return 0;
    }

    public static boolean isLeapYear (int year) {
        return (year % 4 == 0);
    }
}
