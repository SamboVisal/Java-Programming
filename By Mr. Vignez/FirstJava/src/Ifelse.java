import java.util.Scanner;
public class Ifelse {
	static Scanner button;
	int a=18;
	public static void main(String[] args) 
	{
		Ifelse i=new Ifelse();
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int s = button.nextInt();
		if(s >= 18)
			System.out.println("You can vote");
		else
			System.out.println("You can not");
		if(i.a >=18)
			System.out.println("Good luck");
		else
			System.out.println("ByeBye DUDE!");
	}

}
