package com;

import java.util.*;

public class StudentManagement {
	static ArrayList<Student>studentList = new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	
	public static void addStudent() {
		System.out.print("Enter ID:");
		int id=sc.nextInt();
		System.out.print("Enter Name:");
		sc.nextLine();
	    String name=sc.nextLine();
	    System.out.print("Enter Age:");
	    int age=sc.nextInt();
	    
	    studentList.add(new Student(id, name, age));
	    System.out.println("Student added successfully!");

	}
	
	public static void viewStudents() {
		if(studentList.isEmpty()) {
			System.out.println("No students found");
			return;
		}
		System.out.println("\n-----Student List------");
		for(Student s:studentList) {
			s.display();
		}
	}
	
	public static void updateStudent() {
		System.out.print("Enter ID to update:");
		int id=sc.nextInt();
		for(Student s:studentList) {
			if(s.id==id) {
				sc.nextLine();
				System.out.print("Enter new name:");
				s.name=sc.nextLine();
				System.out.print("Enter new age:");
				s.age=sc.nextInt();
				System.out.println("Student updated Successfully!");
				return;
			}
		}
		System.out.println("Student not found");
	}
	
	public static void deleteStudent() {
		System.out.print("Enter ID to delete:");
		int id = sc.nextInt();
		Iterator<Student>it=studentList.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			if(s.id==id) {
			it.remove();
			System.out.println("Student deleted successfully!");	
		    }
	    }
		System.out.println("Student not found.");
	}
	
	public static void searchStudent() {
		System.out.print("Enter ID to search:");
		int id = sc.nextInt();
		for(Student s:studentList) {
			if(s.id==id) {
				System.out.println("Student found:");
				s.display();
				return;
			}
		}
		System.out.println("Student not found.");
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== Student Management System ====");
			System.out.println("1.Add Student");
			System.out.println("2.View Students");
			System.out.println("3.Update Student");
			System.out.println("4.delete Student");
			System.out.println("5.Search student");
			System.out.println("6.Exit");
			
			System.out.print("Enter Your Choice:");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: addStudent();
			        break;
			case 2: viewStudents();
			        break;
			case 3: updateStudent();
	                break;
			case 4: deleteStudent();
	                break;
			case 5: searchStudent();
	                break;
			case 6: System.out.println("Thank You!");
			
			System.exit(0);
	        
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}

