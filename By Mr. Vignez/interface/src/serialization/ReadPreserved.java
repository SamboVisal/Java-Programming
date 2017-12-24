package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPreserved {

	public static void main(String[] args) 
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream("D:\\stream\\preserve.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s;
			
				s = (Student)ois.readObject();
				System.out.println(s);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
