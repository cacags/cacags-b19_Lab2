package Lab_2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//Write a program that asks the user for a positive nonzero 
		//integer value. The program should use a loop to get the 
		//sum of all the integers from 1 up to the number entered.
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a positive nonzero value: ");
		int number = scan.nextInt();
		
		if (number<=0) {
			System.out.println("Invalid input!");
		}else {
			
			for (int i=1; i<=number; i++) {
				sum+=i;
			}
		System.out.println("Sum of the number from 1 to " + number + " is= " + sum);
					
		}
		
	}

}
