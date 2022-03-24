package com.capg.prac;



// Single Inheritance
class Employee{ // Parent Class
	float salary=10000.00f;
	public void showSalary() {
		System.out.println("Salary is "+ salary);
	}
}
// IS a relationship .. Programmer is a Employee
public class Programmer extends Employee{ // Child  class

	float bonus = 2000.0f;
	public void showBonus() {
		System.out.println("Bonus is "+ bonus);
	}
	
	public static void main(String[] args) {
		Programmer m = new Programmer();
		System.out.println(m.salary);
		m.showSalary();
		System.out.println(m.bonus);
		m.showBonus();
	}
}
