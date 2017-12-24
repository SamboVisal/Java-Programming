package list;

import java.util.ArrayList;
import java.util.List;

public class Multilock {
	List list1 = new ArrayList();

	public void Addlist1()
	{
		list1.add(1000);
		list1.add(2000);
		list1.add('A');
		list1.add(1.5);
		System.out.println(list1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilock a = new Multilock();
		a.Addlist1();
	}

}
