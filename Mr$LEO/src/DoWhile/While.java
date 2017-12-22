package DoWhile;
import java.util.Scanner;
public class While {
		static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=0,ch,sum=0,sum2=0,count=0,last=0;
		button = new Scanner(System.in);
		System.out.println("Enter number ");
		num= button.nextInt();
		System.out.println("1/Even number: ");
		System.out.println("2/Odd Number : ");
		System.out.println("3/print five of even");
		System.out.println("4/The first 25% of numbers");
		System.out.println("5/The last 75% of numbers");
		ch = button.nextInt();
		switch(ch){
		case 1: 
			i=1;
			System.out.println("even");
			while(i<=num){
				
				if(i%2==0){
					System.out.println(i);
					i++;
					sum+=i;
					}
					i++;
				
				}
				System.out.println("The sum of even " + sum);
				break;
		case 2: 
				System.out.println("The odd");
				while(i<=num){
					if(i%2!=0){
					System.out.println(i);
					i++;
					sum2+=i;
					}
					i++;
				}
				System.out.println("The sum of odd " + sum2);
				break;
		case 3: System.out.println("The last five of even ");
				i =1;
				while(i<=num){
					if(count<5){
					if(i%2==0){
						System.out.println(i);
						count++;
						last+=i;
					}
					i++;
					
				  }
					
				}
				System.out.println("The sum even last five " + last);
				break;
		case 4: System.out.println("The last 25% of numbers ");
				int n;
				i=1;
				n = (int) ((int) num * 0.25);
				System.out.println(n);
				while(i<=n){
					if(i%2==0){
						System.out.println(i);
						i++;
					}
					i++;
				}
				//TV IS HARMING
				break;
		case 5: 
				n = 25;
					for(int k = num - n; k<=num;k++){
						if(k%2==0){
							System.out.println(k);
						}
					}
					
				break;
		default : break;
		}
		
	}

}
