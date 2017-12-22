package CharacterClass;
import java.util.Scanner;
public class Isup {
	static Scanner button;
	public static void main(String[] args) {
		button = new Scanner(System.in);
		// TODO Auto-generated method stub
		char s;
		s = button.next().charAt(0);
		if(Character.isUpperCase(s))
		{
			while(s!='Z'+1)
			{
				System.out.println(s++);
			}
				
		}
		else if(Character.isLowerCase(s))
		{
			while(s!='z'+1)
			{
				System.out.println(s++);
			}
		}
		else
			System.out.println("Please Input Character");
	}

}
