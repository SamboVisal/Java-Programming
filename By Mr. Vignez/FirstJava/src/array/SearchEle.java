package array;
import java.util.Scanner;
public class SearchEle {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int a[] = new int[10];
		int i,n,ele;
		System.out.println("Enter element ");
		n = button.nextInt();
		for(i=0;i<n;i++){
			a[i] = button.nextInt();
		}
		System.out.println("Here are elements");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		System.out.println("Input number to delete ");
		ele = button.nextInt();
		/*
		int b=0;
		for(i=0;i<n;i++){
			if(a[ele-1]==a[i]){ b=1;
				System.out.println(a[i]);
			}
		}
		if(b==0)
			System.out.println("Not found");
		*/
		for(i=0;i<n;i++){
			if(ele==a[i]){
				for(int j=i; j<n; j++){
					a[j] = a[j+1];
				}
			}
		}
	
		System.out.println("The remain arrays");
		for(i=0;i<n-1;i++){
			System.out.println(a[i]);
		}
		
	}

}
