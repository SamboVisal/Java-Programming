import java.util.Scanner;

public class Student {
	static Scanner b;

	Student (String name)
	{
		System.out.println("Your name is " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll,total=0; float average; float[] mark = new float[3]; 
		Student s = new Student("Sambo Visal");
		b = new Scanner(System.in);
		System.out.println("Enter roll number for student ");
		roll = b.nextInt();
		System.out.println("Input marks for student");
		for(int i =0 ; i<mark.length; i++)
		{
			mark[i] = b.nextFloat();
		}
		for(int i=0; i<3; i++)
		{
			total+=mark[i];
		}
		System.out.println("Student roll number is " + Integer.toString(roll));
		System.out.println("Sum of student ");
		System.out.println(total);
		average=total/3;
		System.out.println("The average of student is " + average);
		if(total>=100)
		System.out.println("Your mark is " + total + " and your grade is \"S\" ");
		else if(total<100 && total >=80)
		System.out.println("Your mark is " + total + " and your grade is \"A\" ");
		else if(total<80 && total >=50)
		System.out.println("Your mark is " + total + " and your grade is \"B\" ");
		else if(total<50 && total >=30)
		System.out.println("Your mark is " + total + " and your grade is \"C\" ");
		else
		System.out.println("Your mark is " + total + " and your grade is \"FAIL And RESIGN\" ");	
	}

}
