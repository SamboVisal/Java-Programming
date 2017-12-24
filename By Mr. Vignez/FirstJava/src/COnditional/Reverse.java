package COnditional;
import java.util.Scanner;
public class Reverse {
	static Scanner button;
	public static void main(String[] args) {
		button = new Scanner(System.in);
		int re=0,digit=0,rev=0,pa,di;
		System.out.print("Enter number to reverse ");
		int num = button.nextInt();
		pa=num;
		while(num!=0)
		{
			re = num%10;
			digit+=re;
			rev= rev*10 + re;
			num/=10;
		}
		
		System.out.println("The reverse number is " + rev);
		System.out.println("The sum of digit is " + digit);
		if(pa==rev)
			System.out.println(pa+" is palindrom");
		else
			System.out.println(pa+" is not palindrom");
	
		
	}

}
