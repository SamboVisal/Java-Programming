package arraysortsearch;

import java.util.Scanner;

public class BinarySearch {
	
	static int Bsearch(int a[],int size,int search) {
		int first=0; int last = size; int mid;
		int pos=-1;
		for(int i=0;i<size;i++) {
			mid= (first+last)/2;
			if(search==a[mid]) {
				pos = i;
				return pos;
			}else if(search>a[mid]){
				first = mid+1;
			}else {
				first = mid-1;
			}
		}
		return pos;
	}
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
		System.out.println("Number to search "); 
		search = input.nextInt();
		j=Bsearch(a,n,search);
		System.out.println(j+1);
	}
	
}
