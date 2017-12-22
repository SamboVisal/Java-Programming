package presentation;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test11DataWriteInt {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
//		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
//		DataInputStream dos = new DataInputStream(fis);
//		int k;
//		while((k=dos.read())!=-1) {
//			System.out.println(k);
//		}
		FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		int i[] = {65,66,67,68,69};
		for(int k : i) {
			dos.writeInt(k);
		}
		fos.flush();
		dos.flush();
		dos.close();
		fos.close();
		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
		DataInputStream dis = new DataInputStream(fis);
		int m;
		while(dis.available()>0) {
			m=dis.readInt();
			System.out.println((char)m);
		}
	}	

}
