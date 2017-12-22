package presentation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test12WriteDataByte {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
//		FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		byte b[] = {65,66,67,68,69};
//		for(byte c: b) {
//			dos.writeByte(c);
//		}
//		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
//		DataInputStream dis = new DataInputStream(fis);
//		while(dis.available()>0) {
//			byte d = dis.readByte();
//			System.out.println(d);
//		}
		FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		String s = "Hello World";
		dos.writeBytes(s);
		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
		DataInputStream dis = new DataInputStream(fis);
		while(dis.available()>0) {
			byte b = dis.readByte();
			System.out.println(b);
		}
	}

	

}
