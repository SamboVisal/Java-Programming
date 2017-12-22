package array;
import java.util.*;
public class deleteN {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int i,d;
		int a[] = new int[100];
		for(i=1;i<=3;i++){
			a[i] = button.nextInt();
		}
		System.out.println("Input number to delete ");
		d = button.nextInt();
		for(i=1;i<=3;i++){
			if(a[i]==d){
				for(int j=i; j<=3; j++){
					a[j] = a[j+1];
				}
			}
		}
		for(i=1;i<=3-1;i++){
			System.out.println(a[i]);
		}
	}

}
