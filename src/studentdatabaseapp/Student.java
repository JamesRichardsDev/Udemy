package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// constructor: prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the students first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter the students last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter the students grade level: ");
		this.gradeYear = in.nextInt();
		setStudentID();

	}

	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Enroll in courses

	public void enroll() {
		// get inside a loop, hit 0 to quit enrolling
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: $" + payment);
		viewBalance();
	}

	// Show Status
public String toString() {
	return "Name: " +firstName + " " + lastName +
			"\nCourses Enrolled: " + courses +
			"\nBalance: $" +tuitionBalance;
			
}
	
	
	
	
	
	
}
