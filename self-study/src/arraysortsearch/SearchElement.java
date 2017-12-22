package arraysortsearch;

import java.util.Scanner;

public class SearchElement {
	static Scanner input;
	public static void main(String[] args) {
		int n,search,j; int a[] = new int[100];
		input = new Scanner(System.in);
		System.out.println("Input element : ");
		n = input.nextInt();
		System.out.println("Number of each elements : ");
		for(int i=1;i<=n;i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Enter no. element to search ");
		search = input.nextInt();
		if(search>n) {
			System.out.println("Out of bound");
		}
		else {
			for(j=0;j<search;j++);
			System.out.println(a[j]);
		}
	}

}
