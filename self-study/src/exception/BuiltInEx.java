package exception;

public class BuiltInEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BuiltInEx e = new BuiltInEx();
		try {
			int a =10,b=0,c=0;
			c=10/0;
			System.out.println(c);
			
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
