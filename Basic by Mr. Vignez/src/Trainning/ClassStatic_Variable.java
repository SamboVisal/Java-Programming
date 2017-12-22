package Trainning;

public class ClassStatic_Variable {
	
	 static double salary;
	
	 static final String name = "I love my family";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary = 1000000;
		String name = "fuck";
		System.out.println(name +" Your life worth " + salary);
		System.out.println(ClassStatic_Variable.name);
	}

}
