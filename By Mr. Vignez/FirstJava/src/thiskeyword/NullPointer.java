package thiskeyword;

public class NullPointer {
	//we put static so no need to get called by object NullPointer
	public  void CallSay(Dummy d)
	{
		try
		{
			d.sayHello();	
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
		}
	}
	public static void main(String[] args) {
		NullPointer nu = new NullPointer();
		Dummy da=new Dummy();
		nu.CallSay(da);
	}

}
