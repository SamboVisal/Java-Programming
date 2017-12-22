package exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"abc","123",null,"xyz"};
		for(int i=0;i<s.length;i++) 
		{
			try 
			{
				int a = s[i].length();
				try {
					a = Integer.parseInt(s[i]);
				}catch(NumberFormatException e) {
					System.out.println("NumberFormatException will be thrown here");
				}
			}catch(NullPointerException e) {
				System.out.println("NullPointerException will be thrown here");
			}
			
		}
		int b = s[1].length();
		System.out.println(b);	
	}
}
