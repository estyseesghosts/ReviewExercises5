package com.estyseesghosts.reviewexercises5;

public class Triangle {
    public static void main () {
        triangle(7);
    }

    public static void triangle(int layers) {
        for (int i = 1; i <= layers; i++) {
            if (i == 1 || i == layers) System.out.println("*".repeat(i));
            else {
                System.out.print("*");
                System.out.print(" ".repeat(i-2));
                System.out.println("*");
            }
        }
    }
}
