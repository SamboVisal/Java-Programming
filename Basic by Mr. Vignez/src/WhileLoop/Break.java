package WhileLoop;
import java.util.Scanner;
public class Break {
	public static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button  = new Scanner(System.in);
		int x1 [] = {10,20,30,40,50,60};
		for(int x=0; x<6; x++){
			if(x1[x] == 40){
				break;
			}
			System.out.println(x1[x]);
		}
	}

}
