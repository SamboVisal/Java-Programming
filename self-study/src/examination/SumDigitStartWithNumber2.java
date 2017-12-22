package examination;

import java.util.Scanner;

public class SumDigitStartWithNumber2 {
	static Scanner input;
	public static void main(String[] args) {
		int n,num=0; int a[] = new int[100];
		input = new Scanner(System.in);
		System.out.println("Input element : ");
		n = input.nextInt();
		System.out.println("Number of each elements : ");
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		for(int i=0;i<n;i++) {
			int number = a [i];
			while(number >=10) {
				number = number /10;
				if(number==2) {
					num++;
				}
			}
		}
		System.out.println("Number start with 2 is "+num);
	}

}
