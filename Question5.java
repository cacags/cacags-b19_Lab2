package Lab_2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// Write a program that computes the tax and tip on a restaurant bill. 
		// The program	should ask the user to enter the charge for the meal. 
		// The tax should be 6.75 percent of the meal charge. The tip should be 20 
		// percent of the total after adding tax. Display the meal charge, tax amount, 
		// tip amount, and total bill on the screen.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the charge of the meal: ");
		double chargeOfMeal = scan.nextDouble();
		double tax = chargeOfMeal*0.0675;
		double tip = (chargeOfMeal + tax) * 0.2;
		double totalBill = chargeOfMeal + tax + tip;
		System.out.println("---------------------");
		System.out.println("Meal charge: " + chargeOfMeal);
		System.out.println("Tax amount: " + tax);
		System.out.println("Tip amount: " + tip);
		System.out.println("Total bill: " + totalBill);
		System.out.println("---------------------");
		
	}

}
