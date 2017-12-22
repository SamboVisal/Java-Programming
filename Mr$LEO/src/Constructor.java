
public class Constructor {
	public static int Age;
	public Constructor(String name)
	{
		System.out.println("Your name is " + name);
	}
	void set(int age)
	{
		 Age = age;
	}
	public int out()
	{
		System.out.println("Your age is "+Age);
		return Age;
	}
	Constructor()
	{
		//default constructor
		String name = "Visal";
		System.out.println("Thank you Mr." + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor bye= new Constructor();
		Constructor ob = new Constructor("Pisal");
		ob.set(20);
		ob.out();
		System.out.println(Age);
		
	}

}
