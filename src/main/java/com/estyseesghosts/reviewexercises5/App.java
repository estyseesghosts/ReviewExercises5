package com.estyseesghosts.reviewexercises5;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

	System.out.println("Choose a program");
	System.out.println("1 - AddNumbers, 2 - AvgMark, 3 - CubeSums, 4 - FindFactors, 5 - IntOrString");
	System.out.println("6 - LastMultiple, 7 - PrintOddIndices, 8 - ReplaceLetter, 9 - Swap, 10 - FiftyPrimes");
	System.out.println("11 - Eleven, 12 - Rectangle");
	int prog = scanner.nextInt();

	switch (prog) {
		case 1: 
			AddNumbers.main();
			break;
		case 2: 
			AvgMark.main(); 
			break;
		case 3: 
			CubeSums2.cubeSum();
			break;
		case 4: 
			FindFactors.main();
			break;
		case 5: 
			IntOrString.main();
			break;
		case 6: 
			LastMultiple.main();
			break;
		case 7: 
			PrintOddIndices.main();
			break;
		case 8: 
			ReplaceLetter.main();
			break;
		case 9: 
			Swap.main();
			break;
		case 10:
			FiftyPrimes.fiftyPrimes();
			break;
		case 11: Eleven.main();
			break;
		case 12: Rectangle.main();
	}
    }
}
