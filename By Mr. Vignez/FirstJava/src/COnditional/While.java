package COnditional;

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
		ch = button.nextInt();
		switch(ch){
		case 1: 
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
	
				i=1;
				while(i<=num&&count<5){
					if(i%2==0){
						int k = i;
						System.out.println(i);
						count++;
						i++;
						last+=k;
					}
					else{
						i++;
						//count++;
					}
				}
				System.out.println("The sum even last five " + last);
				break;
		default : break;
		}
		
	}

}
