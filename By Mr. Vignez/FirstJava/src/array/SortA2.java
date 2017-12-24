package array;
import java.util.*;
public class SortA2 {
	static Scanner button;
	public static void Bsort(int a[],int b){
		int temp=0;
		for(int i=0;i<b;i++)
		{
			for(int j=1;j<=b-i-1;j++){
				if(a[j]<a[j-1])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int a[]=new int[100];
		int i,n;
		System.out.println("Enter element ");
		n = button.nextInt();
		System.out.println("Enter numbers ");
		for(i=0;i<n;i++){
			a[i]=button.nextInt();
		}
		Bsort(a,n);
		System.out.println("Array after sorting ");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

}
