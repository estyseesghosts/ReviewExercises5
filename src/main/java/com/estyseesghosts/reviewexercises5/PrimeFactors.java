package com.estyseesghosts.reviewexercises5;
import java.util.Arrays;

public class PrimeFactors {
    public static void main () {
        primeFactors(36);
    }

    public static void primeFactors(int n) {
        int counter = 0;
        int[] workingList = new int[n];
        while (n != 1) {
            workingList[counter] = LeastFactor.leastFactor(n);
            n = n/LeastFactor.leastFactor(n);
            counter++;
        }

        int[] primeFactors = new int[counter];

        for (int i = 0; i < counter; i++) {
            primeFactors[i] = workingList[i];
        }

        System.out.println(Arrays.toString(primeFactors));
    }
}
