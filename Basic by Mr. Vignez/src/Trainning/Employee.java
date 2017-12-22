package Trainning;
import java.io.*;
public class Employee {

		String name;
		int age;
		String designation;
		double salary;
		public Employee(String name) {
			this.name = name;
		}
		public void empAge(int empAge){
			age = empAge;
		}
		public void empDesignation(String empDesig){
			designation = empDesig;
		}
		public void empSalary(double empSalary){
			salary = empSalary;
		}
		public void outputEmployee(){
			System.out.println("The name is " + name);
			System.out.println("The Age is " + age);
			System.out.println("The Designation is " + designation);
			System.out.println("The Salary is " + salary);
		}
		
}
