package NumberMethod;



public class student implements Comparable <student>//provide natural ordering
{
	Integer id;
	String name;
	public student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
//toString it make a java object printable, it return an equivalent string value of 
	//parents java object, toString belong to object class
	public String toString()
	{
		return id + " " + name;
	}
	@Override
	//first compareTo second
	public int compareTo(student obj) 
	{
	//first id belong to first obj
		//if it equals it will return 0
		//return id-obj.id;
		return name.compareTo(obj.name);
	}
	
}
