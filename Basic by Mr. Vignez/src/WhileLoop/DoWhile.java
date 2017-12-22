package WhileLoop;
import java.util.Scanner;
public class DoWhile {
	public static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int x;
		System.out.println("Enter number "); x = button.nextInt();
		do{
			System.out.println(x);
			x++;
		}while(x<10);
	}

}
