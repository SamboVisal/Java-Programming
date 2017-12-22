package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteClassDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Writer w = new FileWriter("D:\\stream\\hello.txt");
		String name = "Pisal";
		w.write(name);
		w.append('a');
		char c = 'a';
		w.write(c);
		w.write(name);
		w.close();
		System.out.println("Done");
		
	
	}

}
