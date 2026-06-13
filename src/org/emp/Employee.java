package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Employee id is 10");
	}
	public void empName() {
		System.out.println("Employee name is sera");
	}
	public void empPhone() {
		System.out.println("Employee phone number is 876876");
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.empId();		
		e.empName();
		e.empPhone();
	}
}
