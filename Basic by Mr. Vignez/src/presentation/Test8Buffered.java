package presentation;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test8Buffered {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
		BufferedInputStream bos = new BufferedInputStream(fis);
		
		int k = bos.available();
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
//		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
//		BufferedInputStream bis = new BufferedInputStream(fis);
//		int i = bis.available();
//		System.out.println(i);
//		int k;
//		while((k=bis.read())!=-1) {
//			System.out.println(k);
//		}
//		System.out.println("BufferedOutputStream");
//		FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		String s = "Hello World";
//		byte b[] = new byte[5];
//		b=s.getBytes();
//		bos.write(65);
//		bos.write(b);
//		bos.flush();
//		System.out.println(b);
//		bos.write(b,0,3);
//		bos.flush();
////		for(byte c:b) {
////			System.out.println((char)c);
////		}
		
	}

}
