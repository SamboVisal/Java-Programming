package Switch;
import java.util.Scanner;
public class Student {
	static Scanner button;
	public static void main(String[] args) {
		int k,i=0;
		
		int age[] = new int[100];
		String id[] = new String[100];
		String name[] = new String[20];
		button = new Scanner(System.in);
	do{
		button = new Scanner(System.in);
		System.out.println("1/ Input Information");
		System.out.println("2/ Show Information");
		System.out.println("3/ Show Score Of Students");
		System.out.println("4/ Show Grade Of Each Student");
		System.out.println("5/ Exit program");
		k = button.nextInt();
		switch(k){
		case 1 :	System.out.println("***Input Information***");
			String ins = null;
			do{
					System.out.println("Input ID student ");
					id[i] = button.next();
					System.out.println("Input Name of Student ");
					name[i] = button.next();
					System.out.println("Input age of student ");
					age[i] = button.nextInt();
					i++;
					System.out.println("Press Y add more else Will be Exit");
					ins = button.nextLine();
					}while(ins.equals("y"));
					break;
		case 2 : 
					break;
		case 3 : 
					break;
		case 4 : 
			
					break;
		case 5 : 
			
					break;
		default :  
					System.out.println("GoodBye!");
					break;
		}
	}while(k!=5); 
		
		
		
		
		
		
	}
	private static String getch() {
		// TODO Auto-generated method stub
		return null;
	}

}
