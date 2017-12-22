package Special_Keyword;

public class trycatch1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num,num1;
		try{
			num =50;
			num1=num/0;
		}
		catch(Exception c)
		{
			System.out.println("I cannot divide");
		}
	}

}
