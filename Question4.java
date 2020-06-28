package Lab_2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double percentage;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of females: ");
		int numOfFemales = scan.nextInt();
		System.out.print("Enter the number of males: ");
		int numOfMales = scan.nextInt();
		
		percentage = (double)numOfFemales/(numOfFemales+numOfMales)*100;
		System.out.println("Percentage of females: " + percentage + "%");
		System.out.println("Percentage of males: " + (100-percentage) + "%");
	}

}
