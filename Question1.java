package Lab_2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter your next number: ");
		int num2 = scan.nextInt();
		int biggest = num1;
		int lowest = num2;
		
		if (num1>num2) {
			//System.out.println("Largest number is: " + num1);
			biggest = num1;
			lowest = num2;
		}else {
			biggest = num2;
			lowest = num1;
		}
		
		while(true) {
						
			System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			int choice = scan.nextInt();
			
			if (choice == 0) {
				System.out.println("Smallest number is: " + lowest);
				System.out.println("Largest number is: " + biggest);
				break;
			}else if (choice == 1) {
				
				System.out.print("Enter your next number: ");
				int num3 = scan.nextInt();
					if(num3>biggest) {
						biggest = num3;
						
					}else if (num3 < lowest){
						lowest = num3;
					}
			}
		
		}
		
	}

}
