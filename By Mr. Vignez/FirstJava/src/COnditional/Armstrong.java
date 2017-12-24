package COnditional;
import java.util.Scanner;
public class Armstrong {
	static Scanner button;
	public static void main(String[] args) {
		int re=0,arm=0,ar;
		button = new Scanner(System.in);
		int num = button.nextInt();
		ar = num;
		while(num!=0)
		{
			re = num%10;
			arm += re*re*re;
			num/=10;
		}
		if(ar==arm)
			System.out.println(ar+" is armstrong ");
		else
			System.out.println(ar+" is not armstrong");
	}

}
