package WhileLoop;
import java.util.Scanner;
public class ForLoop {
	public static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		int x;
		System.out.println("Enter value "); x = button.nextInt();
		for(x=0;x<=20;x++){
			System.out.println(x + " \t");
		}
	}

}
