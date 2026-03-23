package com;

public class Student {
	int id;
	String name;
	int age;
	
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	public void display() {
		System.out.println("ID:"+ id +",NAME:"+ name +",AGE:"+age);
	
	}

}
