package array;
import java.util.*;
public class CopyArray {
	
	
	static Scanner button;
	public static void main(String[] args) {
		button = new Scanner(System.in);
		int n,i,j=0;
		int a[]=new int[10];
		int b[]=new int[10];
		System.out.println("Enter element ");
		n=button.nextInt();
		System.out.println("Enter first array ");
		for(i=0;i<n;i++)
		{
			a[i] = button.nextInt();
		}
		System.out.println("Enter second array ");
		for(i=0;i<n;i++)
		{
			b[i] = button.nextInt();
		}
		for(i=0;i<n;i++);
		
		for(j=0;j<n;j++){
			a[i++]=b[j];
		}
		for(i=0;i<n+n;i++){
			System.out.println(a[i]);
		}
		
	}

}
