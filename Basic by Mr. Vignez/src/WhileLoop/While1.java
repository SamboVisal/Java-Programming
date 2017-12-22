package WhileLoop;
import java.util.Scanner;
public class While1 {
	public static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		button = new Scanner(System.in);
		System.out.println("Enter value to count ");
		x = button.nextInt();
		while(x<=10){
			System.out.println(x);
			x++;
			System.out.println("\n");
		}
	}

}
