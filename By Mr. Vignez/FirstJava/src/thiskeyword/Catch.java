package thiskeyword;

public class Catch {

	public static void main(String[] args) {
		int num,num1;int result=0;
		try{
			 num=0;
			 result=num1=10/num;
			 System.out.printf("Hello World ",result);
		}
		catch(Exception e){
			System.out.println("Can Not Divided");
			System.out.println(result);
		}
		System.out.println("Am out the catch block");
	}

}
