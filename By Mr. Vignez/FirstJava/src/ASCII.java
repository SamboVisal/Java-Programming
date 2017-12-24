import java.util.Scanner;
public class ASCII {
	static Scanner button;
	public static void main(String[] args) {
		button = new Scanner(System.in);
		int count=0,coun=0,i=0,j=0;
		// TODO Auto-generated method stub
		System.out.println("Enter character ");
		char c = button.next().charAt(0);
		//System.out.println(c);
		if(c>='a' && c<='z')
		{
			j =c;
			while(c!='z'+1){
				i=c;
				System.out.println(c+"="+i );
				c++;
				count++;
			}
			 coun = 26 - count;
		}
		else if(c>='A' && c<='Z')
		{
			
			while(c!='Z'+1){
				i=c;
				System.out.println(c+"="+i);
				c++;
				count++;
			}
			coun = 26 - count;
		
		}
		else {
			while(c>='1' && c<='9'){
				System.out.println(c++);
			}
		
		}
		System.out.println("Number of character ascii " +j);
		System.out.println("Number of character forward " +count);
		System.out.println("Number of character backward " +coun);
	}

}
