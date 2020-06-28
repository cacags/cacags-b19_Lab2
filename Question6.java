package Lab_2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Write a program that will ask the user to enter the amount 
		// of a purchase. The program should then compute the state and 
		// county tax sales tax. Assume the state sales tax is 4 percent 
		// and the county sales tax is 2 percent. The program should display 
		// the amount of the purchase , the state sales tax, the county sales
		// tax, the total sales tax, and the total of the sale (which is the sum of 
		// the amount of purchase plus the total sales tax)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the amount of the purchase: ");
		double amountOfPurchase = scan.nextDouble();
		double stateSaleTax = amountOfPurchase*0.04;
		double countySaleTax = amountOfPurchase*0.02;
		double totalSaleTax = stateSaleTax + countySaleTax;
		double purchaseCharge = amountOfPurchase + totalSaleTax;
		System.out.println("------------------------");
		System.out.println("The amount of the purchase: " + amountOfPurchase);
		System.out.println("State sale tax: " + stateSaleTax);
		System.out.println("County sale tax: " + countySaleTax);
		System.out.println("Total taxes: " + totalSaleTax);
		System.out.println("Total purchase charge: " + purchaseCharge);
		System.out.println("------------------------");
	}

}
