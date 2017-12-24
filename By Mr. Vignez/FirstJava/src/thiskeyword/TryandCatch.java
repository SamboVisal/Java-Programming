package thiskeyword;

public class TryandCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = new String("Pisal");
		char[] s = new char[5];
		try{
			st.getChars(10,5,s,0);
			System.out.print("Copies value is \n");
			System.out.println(s);
		}catch (Exception x){
			System.out.println(x.getMessage());
			//System.out.println("Exception");
		}
		
	}

}
