package Trainning;
import java.io.*;
public class EmployeeTest {
	public static void main(String[] args){
		Employee EmployeeObject= new Employee("Koshka");
		Employee EmployeeObject1= new Employee("Taka");
		EmployeeObject.empAge(20);
		EmployeeObject.empDesignation("Software Enginner");
		EmployeeObject.empSalary(2000);
		EmployeeObject1.empAge(30);
		EmployeeObject1.empDesignation("Super Software Enginner");
		EmployeeObject1.empSalary(3000);
		EmployeeObject.outputEmployee();
		EmployeeObject1.outputEmployee();
	}
}
