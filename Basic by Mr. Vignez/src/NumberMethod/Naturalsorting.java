package NumberMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Naturalsorting {
	
	public static void main(String[] args)
	{
		student s1 = new student(400,"Pisal");
		student s2 = new student(300,"Pisal");
		student s3 = new student(200,"Pisal");
		student s4 = new student(100,"Pisal");
		List <student> list = new ArrayList<student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		//list here is an object then we need to implement Compareble at student class
			//then we need to add compareTo() to be sorted
		Collections.sort(list);
		System.out.println(list);
	}
}
