package Stringmethod;
import java.io.IOException;
import java.util.*;
public class ss {
	static Scanner button;
	// String name[];
	public static void main(String[] args) throws IOException {
		
		button = new Scanner(System.in);
		char name[] = new char[100];
		StringBuffer f= new StringBuffer("asdf ");
		f.append("pisal");
		int i,n=5;
		for(i=0;i<n;i++)
		{
			name[i] =(char)System.in.read();
			//name[i] = button.next().charAt(0);
		}
		for(i=0;i<n;i++){
			System.out.println(name[i]);
			
		}
		System.out.println(f);
	}

}
