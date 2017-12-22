package Lesson1;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner button = new Scanner(System.in);
		int i,age,id;
		
		System.out.println("1/Enter Information");
		System.out.println("2/Delete Information");
		System.out.println("3/Edit Information");
		System.out.println("4/Show Information");
		System.out.println("Exit Program");
		System.out.println("Enter Choice");
		i = button.nextInt();
		System.out.println("The Input Is " + i);
		switch(i){
		
		case 1:	System.out.println("Input Name : "); 
				String name = button.nextLine();
				System.out.println("Input Age");  
				age = button.nextInt(); 
				System.out.println("Input Sex");  
				String sex = button.nextLine();
				System.out.println("Input Id");		
				id = button.nextInt();
			
			break;
		case 2: break;
		case 3: break;
		case 4: break;
		}
		}

}
