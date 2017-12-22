package writer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BinaryDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
//		OutputStream os = new FileOutputStream("D:\\stream\\binary.bin");
//		String s = "Pisal";
//		byte b[] = new byte[100];
//		b=s.getBytes();
//		os.write(b);
InputStream is = new FileInputStream("D:\\stream\\binary.bin");
BufferedInputStream bis = new BufferedInputStream(is);
		int k ;
		while((k=bis.read())!=-1) {
			System.out.println(k);
		}
	}

}
