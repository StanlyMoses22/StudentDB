package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String software = null;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourses = 5000;
	private static int id = 1000;
	
	//Constructor : prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Front-End Developer \n2 - Java Developer \n3 - Python Developer \n4 - Sql Developer\n Enter Student SOftware Course");
		this.software = in.nextLine();
		
		setStudentID();
				
	}
	//Generate an ID
	
	private void setStudentID() {
	
		//software + ID
		id++;
		this.studentID = software + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, 
		do {
		System.out.print("Enter course to enroll(Q to quit)");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n  " + course;
			tuitionBalance = tuitionBalance + costOfCourses;
		}
		else {
			break;
		}
		}while (1 != 0);
		
		
	}

	//view balance
	public void viewBalance() {
		System.out.println("Your balance is : Rs." + tuitionBalance);
	}
	
	//pay tuition
	public void payTuition() {
		System.out.println("Enter your Payment : Rs.");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs." + payment);
		viewBalance();
	}
	//Show status
	
	public String toString(){
		return "Name: " + firstName + " " + lastName +
				"\nSoftwares: " + software +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: Rs." + tuitionBalance;
	}
}
