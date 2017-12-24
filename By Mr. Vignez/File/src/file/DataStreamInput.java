package file;

import java.io.*;
public class DataStreamInput {

	public static void main(String[] args) 
	{
		byte b[] = new byte[100];
		try
		{
			DataInputStream dis = new DataInputStream(new BufferedInputStream (new FileInputStream("D:\\stream\\hello.txt")));
		//	DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\stream\\hello.txt"));
		
			try 
			{
				dis.read(b);
				String s = new String(b);
				System.out.println(s);
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		catch(FileNotFoundException e){
			
		}
		
	}

}
