import java.util.Scanner;
public class Compare3 {

	static Scanner button;
	public static void main(String[] args) {
		int a,b,c,d;
		button = new Scanner(System.in);
		a = button.nextInt();
		b = button.nextInt();
		c = button.nextInt();
		if(a>b){
			if(b>c){
				System.out.println("The largest is " + a);
			}
			else{
				System.out.println("The largest is " + c);
			}
		}
		else{
			if(b>c){
				System.out.println("The largest is " + b);
			}
			else{
				System.out.println("The largest is " + c);
			}
				
		}
	}

}
