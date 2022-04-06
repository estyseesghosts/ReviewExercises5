package com.estyseesghosts.reviewexercises5;

public class Digit {
    public static void main() {
        System.out.println(digit(763, 0));
        System.out.println(digit(8574,2));
        System.out.println(digit(78,4));

    }

    public static int digit (int n, int pos) {
        String num = "" + n;
        pos = num.length() - pos - 1;

        if (pos < 0) return 0;
        else return Integer.parseInt(num.substring(pos, pos+1));

        /* 
        basically since u cant just pull a number from a specific position from an int
        it puts the number into a string then grabs the position that way
        the reason the position is length - pos - 1 is to account for the fact that
        pos is counting from the right, but we need to count from the left;
        and that the index starts at 0 so we have to subtract 1 to get 
        the correct place

        if position is negative that means its out of bounds so we return zero to avoid 
        out of bounds exceptions 

        Integer.parseInt() takes a string and parses it as an integer
        num.substring(pos, pos+1) gets the substring at the position 
        so basically that part takes the string character at that position and turns it to an int and returns it
        */
    }
}
