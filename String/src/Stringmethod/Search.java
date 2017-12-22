package Stringmethod;
import java.util.Scanner;
public class Search {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		String name[] = new String[10];
		String search;
		boolean re;
		int b;
		System.out.println("Input amout of names");
		int n = button.nextInt();
		for(int i=0; i<n;i++){
			name[i] = button.next();
		}
		System.out.println("Enter name to search ");
		search = button.next();
		b=0;
		for(int i=0; i<n; i++){
		
			if(re = search.contentEquals(name[i])==true){
				b=1;
				System.out.println(name[i]);
			}
				
		}
		if(b==0)
			System.out.println("Not not found");
		else
			System.out.println("Here bitch!");
		
	}

}
