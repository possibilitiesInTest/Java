package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
<<<<<<< HEAD
	private int studentID;
	private String courses;
	private String tuitionBalance;
	private int costOfCourse = 600;
	
=======
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1001;
>>>>>>> 594722aa0263f558cfb618c3abf5c560e9129b7d
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
<<<<<<< HEAD
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
	}
	
	
	// Generate an ID
	
	
	// View Balance
	
	
	// Pay Tuition
	
	
	// Show status

	
}
=======
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
		public void enroll() {
			// Get inside a loop, user hits 0
			do {
				System.out.print("Enter course to enroll (Q to quit): ");
				Scanner in = new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q")) {
					courses = courses + "\n " + course;
					tuitionBalance = tuitionBalance + costOfCourse;
				}
				else {
					System.out.println("BREAK");
					break;
				}
				System.out.println("BREAK!");
				break;
			}
			while(1 !=0);
		
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition balance: " + tuitionBalance);
		}
		
		// View balance
		public void viewBalance() {
			System.out.println("Your balance is: $" + tuitionBalance);
		}
			
		
		// Pay Tuition
		public void payTuition(int payment) {
			viewBalance();
			System.out.print("Enter your payment: $");
			Scanner in = new Scanner(System.in);
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $" + payment);
			viewBalance();
		}
		
		// Show status
		public String showInfo() {
			return "Name: " + firstName + " " + lastName +
					"\nGrade Level: " + gradeYear +
					"\nCourses Enrolled: " + courses +
					"\nBalance: $" + tuitionBalance;
 		}
		
}
>>>>>>> 594722aa0263f558cfb618c3abf5c560e9129b7d
