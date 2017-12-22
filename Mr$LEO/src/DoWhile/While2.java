package DoWhile;
import java.util.Scanner;
public class While2 {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num=0,last=0,count=0,total=0;
		button = new Scanner(System.in);
		System.out.println("The last five of even ");
		num = button.nextInt();
		i=1;
		while(i<=num){
			if(count<5){
			if(i%2==0){
				System.out.println(i);
				count++;
				i++;
				total=last+=i;
			}
			i++;
			
		  }
			
		}
		
		System.out.println("The sum even last five " + total);
	
	}
	
}
