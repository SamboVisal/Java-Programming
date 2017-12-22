package presentation;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//data is more high level and not interact with hard disk
public class Test9DataInputStream {

	public static void main(String[] args)throws IOException {	
		
		FileOutputStream fos = new FileOutputStream("D://stream//hello.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		byte b[] = new byte[100];
		String name = "LeeMinho";
		b = name.getBytes();
		dos.write(b);
		dos.flush();
		dos.close();
		System.out.println("Done for writing data");
		
//		FileInputStream fis = new FileInputStream("D://stream//hello.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		DataInputStream dis = new DataInputStream(bis);
//		
//		int k;
//		while((k=dis.read())!=-1) {
//			System.out.println((char)k);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		OutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
		
//		int []i = {65,66,67,68,69};
//		for(int v: i) {
//			dos.writeInt(v);
//		}
//		dos.flush();
//		System.out.println("Done for write");
//		InputStream fis = new FileInputStream("D:\\stream\\hello.txt");
//		DataInputStream dis = new DataInputStream(fis);
//		int k;		
//		while((k=dis.readInt())!=-1) {
//			System.out.println(k);
//		}
//		dis.close();
//		System.out.println("Done for reading");
//		
		
		
//		InputStream is = new FileInputStream("D:\\stream\\hello.txt");
//		DataInputStream dis = new DataInputStream(is);
//		int count = dis.available();
//		System.out.println(count);
//		byte b [] = new byte[count];
//		dis.read(b);
//		for(byte c : b) {
//			char ch = (char)c;
//			System.out.println(ch);
//		}

	


		
	}

}
