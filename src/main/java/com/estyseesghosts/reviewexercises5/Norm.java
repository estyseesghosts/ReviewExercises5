package com.estyseesghosts.reviewexercises5;
import java.lang.Math;

class Norm {
    public static void main() {
        System.out.println(norm(4.3,1.0,6.6));
    }

    public static double norm(double x, double y, double z) {
        x *= x;
        y *= y; 
        z *= z; 
        return Math.sqrt(x+y+z);
    }
}
