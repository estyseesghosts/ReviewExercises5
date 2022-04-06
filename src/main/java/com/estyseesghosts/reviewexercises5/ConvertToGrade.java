package com.estyseesghosts.reviewexercises5;

public class ConvertToGrade {
    public static void main () {
        System.out.println(convertToGrade(2));
        System.out.println(convertToGrade(49));
        System.out.println(convertToGrade(50));
        System.out.println(convertToGrade(60));
        System.out.println(convertToGrade(70));
        System.out.println(convertToGrade(80));
        System.out.println(convertToGrade(90));
        System.out.println(convertToGrade(100));
        System.out.println(convertToGrade(101));
        System.out.println(convertToGrade(-2));
    }

    public static char convertToGrade (int grade) {
        if (grade >= 0 && grade <= 49) return 'F';
        else if (grade > 49 && grade <= 59) return 'D';
        else if (grade > 59 && grade <= 69) return 'C';
        else if (grade > 69 && grade <= 79) return 'B';
        else if (grade > 79 && grade <= 100) return 'A';
        else return 'X';
    }
}
