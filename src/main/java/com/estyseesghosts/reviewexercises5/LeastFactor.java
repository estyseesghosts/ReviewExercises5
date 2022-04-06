package com.estyseesghosts.reviewexercises5;

public class LeastFactor {
    public static void main () {
        System.out.println(leastFactor(12));
    }

    public static int leastFactor(int n) {
        int[] factors = factor(n);
        int prime = 999;
        for (int i: factors) {
            if (isPrime(i) && i < prime) prime = i;
        }
        return prime;
    }

    public static int[] factor (int in) {
        int factors = 0; int counter = 0;

        for (int i = 1; i <= in; i++) {
            if (in % i == 0) factors++;
        }

        if (factors == 2) {
            int[] out = new int [2];
            out[0] = 1;
            out[1] = in;
            return out;
        }

        int[] out = new int[factors];

        for (int i = 1; i <= in; i++) {
            if (in % i == 0) {
                out[counter] = i;
                counter++;
            }
        }

        return out;
    }

    static boolean isPrime (int input) {
		if (input <= 1) return false; 

		int factors = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) factors++;
        }

		return (factors == 2);
	}
}
