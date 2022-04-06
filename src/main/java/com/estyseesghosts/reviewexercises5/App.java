package com.estyseesghosts.reviewexercises5;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        
	Scanner scanner = new Scanner(System.in);

	System.out.println("Choose a program");
	System.out.println("1 - Norm, 2 - IsSquare, 3 - Digit, 4 - ConvertToGrade");
	System.out.println("5 - Triangle, 6 - LeastFactor, 7 - PrimeFactors, 8 - DayNumber");

	int prog = scanner.nextInt();

	switch (prog) {
		case 1: 
			Norm.main();
			break;
		case 2: 
			IsSquare.main(); 
			break;
		case 3: 
			Digit.main();
			break;
		case 4: 
			ConvertToGrade.main();
			break;
		case 5: 
			Triangle.main();
			break;
		case 6: 
			LeastFactor.main();
			break;
		case 7: 
			PrimeFactors.main();
			break;
		case 8: 
			DayNumber.main();
			break;
		case 9: 
			//Swap.main();
			break;
		case 10:
			//FiftyPrimes.fiftyPrimes();
			break;
		case 11: 
			//Eleven.main();
			break;
		case 12: 
			//Rectangle.main();
	}
    }
}
