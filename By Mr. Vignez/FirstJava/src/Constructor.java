
public class Constructor {
	static int myage;
	Constructor (String name)
	{
		System.out.println("Your name is "+name);
	}
	void set(int age)
	{
		myage = age;
	}
	int getage()
	{
		return myage;
	}
	void output()
	{
		System.out.println("Your age is " + getage());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ob = new Constructor("Visal");
		ob.set(20);
		ob.getage();
		ob.output();
		System.out.println("Your age is " + Constructor.myage);
	}

}
