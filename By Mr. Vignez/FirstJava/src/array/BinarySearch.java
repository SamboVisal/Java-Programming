package array;
import java.util.*;
public class BinarySearch {
	static Scanner button;
	public static int Bsearch(int a[], int ele, int s) {
		int pos = -1,beg=0,mid=0,end=s-1;
		int i=0;
		while(i<s)
		{
			mid=(beg+end)/2;
			if(ele==a[mid]){
				pos = mid;
				return pos;
			}
			else if(ele>a[mid]){
				beg = mid+1;
			} 
			else{
				beg = mid -1;
			}
			i++;
		}
		return pos;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = new int[100];
		int i,j,n,pos;
		button = new Scanner(System.in);
		System.out.println("Enter element ");
		n = button.nextInt();
		for(i=1;i<=n;i++)
		{
			a[i] = button.nextInt();
		}
		System.out.println("Input element to search ");
		j = button.nextInt();
		pos = Bsearch(a,j,n);
		if(pos==-1){
			System.out.println("The number is not found");
		}
		else
			System.out.println("The number found in element " + pos);
	}

}
