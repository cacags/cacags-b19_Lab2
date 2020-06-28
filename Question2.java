package Lab_2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of eaten cookies: ");
		int numberOfCookies = scan.nextInt();
		double oneCookieCalorie = (double) 300/(40/10);
		double theNumberOfCalories = numberOfCookies*oneCookieCalorie;
		System.out.println("The number of total calories consumed: " + theNumberOfCalories);
		
	}
	
}
