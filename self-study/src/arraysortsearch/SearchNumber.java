package arraysortsearch;

import java.util.Scanner;

public class SearchNumber {
	static Scanner input;
	public static void main(String[] args) {
		int n,search; int a[] = new int[100];
		input = new Scanner(System.in);
		System.out.println("Input element : ");
		n = input.nextInt();
		System.out.println("Number of each elements : ");
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Input number to search");
		search = input.nextInt();
		int k=0;
		for(int i=0;i<n;i++) 
		{
			if(a[i]==search) {
				k=1;
				System.out.println("Here is "+a[i]);
				if(k==0) {
					System.out.println("not exist");
				}else {
					System.out.println("Thank you");
				}
				break;
			}
			
		}
	}

}
