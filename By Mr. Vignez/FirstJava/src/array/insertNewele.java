package array;
import java.util.*;
public class insertNewele {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int i,n,ele,num;
		int a[] = new int[100];
		int b[] = new int[100];
		System.out.println("Enter elements ");
		n = button.nextInt();
		System.out.println("Enter number of elements ");
		for(i=1;i<=n;i++)
		{
			a[i] = button.nextInt();
		}
		System.out.println("Enter element that want to add");
		ele = button.nextInt();
		System.out.println("Enter new number ");
		num = button.nextInt();
		for(i=ele;i<=n;i++)
		{
		
		}
		a[ele] = num;
		n++;
		for(i=1;i<=n;i++)
		{
			System.out.println(a[i]);
		}
	
	}	

}
