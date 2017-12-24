package array;
import java.util.*;
public class SortA {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int n,i,j,te;
		int a[] = new int[10];
		System.out.println("Enter element ");
		n = button.nextInt();
		System.out.println("Enter numbers ");
		for(i=1;i<=n;i++)
		{
			a[i] = button.nextInt();
		}
		System.out.println("Array before sorting ");
		for(i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Array after sorting ");
	
		for(i=1;i<=n;i++){
			for(j=i+1;j<=n;j++)
			{
				if(a[i]<a[j])
				{
					te = a[i];
					a[i] = a[j];
					a[j] = te;
				}
			}
		}
		for(i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
