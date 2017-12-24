package array;
import java.util.Scanner;
public class Testing {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int i,j;
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				a[i][j] = button.nextInt();
			}
			System.out.printf("\n");
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				b[i][j] = button.nextInt();
			}
			System.out.printf("\n");
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				c[i][j] = a[i][j]+b[i][j];
			}
			System.out.printf("\n");
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.println(c[i][j]);
			}
			System.out.printf("\n");
		}
		
	}

}
