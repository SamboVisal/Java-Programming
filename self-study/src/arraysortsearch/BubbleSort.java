package arraysortsearch;

import java.util.Scanner;

public class BubbleSort {
	static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,tem; int a[] = new int[100];
		input = new Scanner(System.in);
		System.out.println("Input element : ");
		n = input.nextInt();
		System.out.println("Number of each elements : ");
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					tem = a[i];
					a[i] = a[j];
					a[j] = tem;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
