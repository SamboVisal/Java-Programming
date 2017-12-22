package SamboVisalProgram;
import java.io.IOException;
import java.util.*;
public class ATM {
	int ch,i=0,n=0;
	char c;
	int age[]=new int[100];
	long phone[]=new long[100];
	String name[] = new String[100];
	String sex[] = new String[100];
	String id[] = new String[100];
	int balance[] = new int[100];
	static Scanner button;
	public void  input()
	{
		do{
			System.out.println("Enter Id "); id[i] = button.next();
			System.out.println("Enter Username "); name[i] = button.next(); 
			System.out.println("Enter Age "); age[i] = button.nextInt(); 
			System.out.println("Enter Sex "); sex[i] = button.next();
			System.out.println("Enter Phone Number "); phone[i] = button.nextLong();
			balance[i]=0;
			System.out.println("Press Y to add more ");
			c = button.next().charAt(0);
			i++;
			}while(c=='Y' || c=='y'); 	
	}
	public void show()
	{
		c='Y';
		do{
		System.out.printf("%10s%10s%10s\n","ID","Name","Balance");
		for(n=0;n<i;n++)
			{
			System.out.printf("%10s%10s%10d$\n",id[n],name[n],balance[n]);
			}
			System.out.println("Press Any key to exit");
		}while(c=='y');
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ATM obj = new ATM();
		button = new Scanner(System.in);
		int ch;
	do{	
		System.out.println("1/Input Information");
		System.out.println("2/Show Information");
		System.out.println("3/Delete Information");
		System.out.println("4/Search Information");
		System.out.println("5/Edit Information");
		System.out.println("6/Deposite Information");
		System.out.println("7/Withdraw Information");
		System.out.println("8/Exit Program");
		System.out.println("Your Choice \n");
		ch=button.nextInt();
		switch(ch)
		{
		case 1:		
					obj.input();
					break;
		case 2: 
					obj.show();
					break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: break;
		case 8: 
				System.out.println("GoodBye");
				break;
		}
	   }while(ch!=8);
	}


}
