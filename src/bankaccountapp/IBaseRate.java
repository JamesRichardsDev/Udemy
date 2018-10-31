package bankaccountapp;

import java.util.Scanner;

public interface IBaseRate {

	// Write a method that returns a base rate
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number less than 10: ");
		int num;
		while (true) {
		    try {
		        num = Integer.parseInt(sc.nextLine());
		        if (num >= 10) {
		            System.out.print("Too big. Try again: ");
		            continue;
		        }
		        break;
		    } catch(NumberFormatException e) {
		        System.out.print("Invalid number. Try again: ");
		    }
		}

	}
	
}
