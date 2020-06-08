package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private String tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4- Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
		
		// Generate an ID
		private void setStudentID() {
			// Grade Level + ID
			id++;
			studentID = gradeYear + "" + id;
		}
		
		// Enroll in courses
		
		
		
		// View balance
		
		// Pay Tuition
		
		// Show status
	

}
