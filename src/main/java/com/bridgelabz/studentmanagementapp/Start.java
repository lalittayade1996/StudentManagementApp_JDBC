package com.bridgelabz.studentmanagementapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("WELCOME TO STUDENT MANAGEMENT APP");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to Exit app");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
//	add student...
				System.out.println("ENTER USER NAME :- ");
				String name = br.readLine();

				System.out.println("ENTER USER PHONE :- ");
				String phone = br.readLine();

				System.out.println("ENTER USER CITY :- ");
				String city = br.readLine();

//	create student object to store student
				Student st = new Student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added successfully...");
				} else {
					System.out.println("Something went wrong try again ...");
				}
				System.out.println(st);

			} else if (c == 2) {
				// delete student...
				System.out.println("Enter Student Id to Delete :- ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted....");
				}else
				{
					System.out.println("Something Went Wrong...");
				}
				
			} else if (c == 3) {
                //	display students...
				StudentDao.showAllStudent();
			} else if (c == 4) {
                //	exit
				break;
			} else {
			}
		}
		System.out.println("THANKYOU FOR USING MY APPLICATION ....");
		System.out.println("SEE YOU SOON ......BYE BYE !!!!");
	}
}
