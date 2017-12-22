import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class OutputStream {

	private static Scanner input;

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream os = new FileOutputStream("D:\\stream\\hello.txt");
		FileInputStream in = new FileInputStream("D:\\stream\\hello.txt");
		//input = new Scanner(System.in);
		String name = "fuck";
		byte[] b = new byte[100];
	    b = name.getBytes();
		os.write(b);
		byte[] c = new byte[100];
		in.read(c);
		int i=0;
		int d = 0;
		while((i=in.read())!=-1) {
			d = in.available();
			System.out.println(d);
			System.out.println((char)i);
		}
		os.flush();
		os.close();
		System.out.println("Am so done with you");
	}

}
