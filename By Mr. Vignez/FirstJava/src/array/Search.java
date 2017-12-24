package array;
import java.util.Scanner;
public class Search {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int a[] = new int[10];
		int n,s,b,p=0,ele;
		System.out.println("Enter element ");
		n = button.nextInt();
		for(int i =0; i<n; i++){
			a[i] = button.nextInt();
		}
		System.out.println("Enter number to search ");
		s = button.nextInt();
		b=0;
		for(int i=0; i<n; i++){
			if(s == a[i]){  b=1;
				p=i+1;
				System.out.println(a[i]);
				System.out.println("It is in element " + p);
			}
		}
		if(b==0)
			System.out.println("Not found");
		else
			System.out.println("Here u are");
		System.out.println("Input element to delete ");
		ele = button.nextInt();
		if(ele>n)
			System.out.println("Element is over original");
		
		for(int i=ele-1; i<n-1; i++){
			a[i]=a[i+1];
		}
		n--;
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
	}

}
