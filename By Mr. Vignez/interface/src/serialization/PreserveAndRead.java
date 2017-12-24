package serialization;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PreserveAndRead {

	public static void main(String[] args) 
	{
		Student s1 = new Student(19,"Visal");
		try 
		{
			FileOutputStream fos = new FileOutputStream("D:\\stream\\preserve.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
