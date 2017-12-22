package presentation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test10DataINT {
/*
 
Bytes for this operation are read from the contained input stream.
Specified by:readInt in interface DataInput
Returns:the next four bytes of this input stream, 
interpreted as an int.
 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
		DataOutputStream dos = new DataOutputStream(fos);
	
		
		
		
		
		
		
		
		
		
		
		
		
		//write()
		/*
		dos.write(65);
		dos.flush();
		dos.close();
		fos.close();
		*/
		//write(byte[] b)
		/*
		byte[] b = {65,66,67,68,69,70};
		for(byte v:b) {
			dos.writeInt(v);
		}
		dos.flush();
		dos.close();
		System.out.println("Done");
		*/
		//writeInt()
		/*
		int i[]= {65,66,67,68,69};
		for(int j:i) {
			dos.writeInt(j);
		}
		dos.flush();
		dos.close();
		System.out.println("Done writing");
		*/
		//writeByte()
		/*
		int b[]= {65,66,67,68,69};
		for(int c:b) {
			dos.writeByte(c);
		}*/
		//writeBytes
		/*
		String s = "Hello World";
		dos.writeBytes(s);
		dos.flush();
		dos.close();
		*/
	}

}
