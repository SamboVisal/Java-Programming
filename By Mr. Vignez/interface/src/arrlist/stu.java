package arrlist;
import java.util.ArrayList;
import java.util.*;
public class stu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu1 s1 = new stu1 (100,"Pisal");
		stu1 s2 = new stu1 (200,"Koko");
		stu1 s3 = new stu1 (300,"Kaka");
		List <stu1> arr = new ArrayList <stu1>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		Iterator <stu1> it = arr.iterator();
		while(it.hasNext())
		{
			stu1 st = (stu1) it.next();
			System.out.println(st.age + " " + st.name);
		}
		for(stu1 b: arr){
			System.out.println(b.age + " " + b.name);
		}
	}

}
