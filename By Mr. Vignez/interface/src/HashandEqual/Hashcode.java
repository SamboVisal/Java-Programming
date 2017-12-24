package HashandEqual;

import java.util.HashSet;
import java.util.Set;

public class Hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(100,"ABC");
		student s2 = new student(100,"ABC");
		student s3 = new student(100,"BC");
		student s4 = new student(100,"AC");		
		Set<student> set = new HashSet<student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		if(s1.equals(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		System.out.println(set);
	}

}
