import java.util.Scanner;

public class Compare4 {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		button = new Scanner(System.in);
		System.out.print("Enter value of a ");
		a = button.nextInt();
		System.out.print("Enter value of b ");
		b = button.nextInt();
		System.out.print("Enter value of c ");
		c = button.nextInt();
		System.out.print("Enter value of d ");
		d = button.nextInt();
		if(a>b){
			if(a>c){
				if(a>d){
					System.out.println("The largest value is " + a);
				}
				else{
					System.out.println("The largest value is " + d);
				}
			}
			else{
				if(c>d){
					System.out.println("The largest value is " + c);
				}
				else{
					System.out.println("The largest value is " + d);
				}
			}
			
		}
		else{
			if(b>c){
				if(b>d){
					System.out.println("The largest value is " + b);
				}
				else{
					System.out.println("The largest value is " + d);
				}
			}
			else{
				if(c>d){
					System.out.println("The largest value is " + c);
				}
				else{
					System.out.println("The largest value is " + d);
				}
			}
		}
			
		
		
		
	}

}
