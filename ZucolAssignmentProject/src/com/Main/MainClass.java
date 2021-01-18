package com.Main;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	System.out.println("Welcome Loan App");
	Scanner input = new Scanner(System.in);

	// Prompt the user to enter the loan amount and
	// loan period in number of years
	System.out.print("Loan Amount: ");
	double loanAmount = input.nextDouble();
	System.out.print("Number of Years: ");
	int numberOfYears = input.nextInt();


	// Display table header
	System.out.println("Interest Rate    Monthly Payment    Total Payment");
	System.out.println("-------------------------------------------------");
	// Display table with interest rates
	for (double i = 5.0; i <= 8; i += 0.125) {
		double interestRate=i;
		System.out.printf("%-5.3f", i);
		System.out.print("%           ");
		// Obtain the monthly interest rate
					double monthlyInterestRate = interestRate / 1200;
					double monthlyPayment = loanAmount * monthlyInterestRate / 
							(1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
					double totalPayment = monthlyPayment * numberOfYears * 12;
		//Printing Values
		if(monthlyPayment>=10)
		System.out.printf("%-19.2f", monthlyPayment*10);
		else	System.out.printf("%-19.2f", monthlyPayment);
		if(totalPayment>=100)
		System.out.printf("%-8.2f\n",totalPayment*10);
		else		System.out.printf("%-8.2f\n",totalPayment*10);
		System.out.println("-------------------------------------------------");
	}
	input.close();
}
}
