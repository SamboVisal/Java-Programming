package array;

public class arrlist2 implements Comparable<arrlist2>
{
	String name;
	Integer age;
	public arrlist2(String nam,int ag)
	{
		name = nam;
		age  = ag;
	}
	
	public String toString()
	{
		return name + " " + age; 
	}
	@Override
	public int compareTo(arrlist2 o)
	{
		return age-o.age;
		
	}
}
