package com.estyseesghosts.reviewexercises5;
import java.lang.Math;
import java.util.Scanner;

public class Triangle2 {
    public static void main () {
        TriangleObj newTriangle = new TriangleObj();

        Scanner scanner = new Scanner(System.in);
        String triangleSides = "";

        while (true) {
            System.out.println("Enter the sides of your triangle, or 0 0 0 to quit");
            triangleSides = scanner.nextLine();

            if (triangleSides.equals("0 0 0")) break;

            String[] triangle = triangleSides.split(" ");
            
            newTriangle.sideA = Integer.parseInt(triangle[0]);
            newTriangle.sideB = Integer.parseInt(triangle[1]);
            newTriangle.sideC = Integer.parseInt(triangle[2]);
            
            newTriangle.printTriangle();
        }
    }
}

class TriangleObj {
    int sideA, sideB, sideC;
    int[] sides = new int[] {sideA, sideB, sideC};
    boolean isRig = false;

    String type, angleType;

    final String EQU = "Equilateral";
    final String ISO = "Isoceles";
    final String SCA = "Scalene";

    final String ERR = "Invalid";

    final String ACU = "Acute";
    final String OBT = "Obtuse";
    final String RIG = "Right";

    public TriangleObj (int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public TriangleObj () {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    public void printTriangle () {
        findType();
        if (type.equals(ERR)) System.out.println("Invalid triangle");
        else System.out.println("It is " + type + " and " + angleType);
    }

    public void isPythagoras () {
        int a = this.sideA * this.sideA;
        int b = this.sideB * this.sideB;
        int c = this.sideC * this.sideC; 

        if (a+b==c || a+c==b || b+c==a) {
            isRig = true;
            angleType = RIG;
        }

        else {
            isRig = false;
        }
    }

    public void findType () {
        if (this.sideA <= 0 || this.sideB <= 0 || this.sideC <= 0) type = ERR;
        else {
            if (isIsoceles()) {
                if (isEquilateral()) equilateral();
                else isoceles();
            }
            else scalene();
        }
    }

    public static int min (int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int max (int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public boolean isEquilateral () {
        return this.sideA == this.sideB && this.sideA == this.sideC;
    }

    public boolean isIsoceles () {
        return this.sideA == this.sideB || this.sideA == this.sideC || this.sideB == this.sideC;
    }

    public void equilateral () {
        type = EQU;
        angleType = ACU;
    }

    public void isoceles () {
        int a = this.sideA;
        int b = this.sideB;
        int c = this.sideC;

        type = ISO;
        
        isPythagoras();

        if (!isRig) {
            if ((a == b && a > c) || (a == c && a > b) || (b == c && c > a))angleType = ACU;
            else angleType = OBT;
        }
    }

    public void scalene () {
        type = SCA;

        isPythagoras();

        if (!isRig) {
            angleType = OBT;
        }
    }

    public void swap (int value, int newPosition) {

    }
}
