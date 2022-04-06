package com.estyseesghosts.reviewexercises5;
import java.lang.Math;

class IsSquare {
    public static void main() {
        System.out.println(isSquare(37)); // false
        System.out.println(isSquare(36)); // true
    }

    public static boolean isSquare(int n) {
        double nc, nf;
        nc = Math.sqrt(n);
        nf = Math.floor(nc);
        return (nc == nf); 
        /* 
        nc is the square root of n 
        nf is the floor of that number 

        if the number is not a square, the square root will be a decimal 
        so nc will be 3.14 and nf will be 3.0 and it will return false 

        if the number is a square it'll already be a whole number, so nc and nf will be equal
        and it will return true
        */
    }
}
