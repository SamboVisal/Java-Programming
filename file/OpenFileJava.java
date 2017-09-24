package file;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFileJava {
/*
 The Desktop class allows a Java application to launch associated applications
  registered on the native desktop to handle a file.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\stream\\selfie.mp4");
		Desktop des = Desktop.getDesktop();
		if(file.exists())
			try {
				des.open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
	}

}
