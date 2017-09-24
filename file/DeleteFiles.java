package file;
import java.io.File;
public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("D:\\filetest");
		File f[]=folder.listFiles();
		for(int i=0;i<f.length;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(f[i].isFile())
			{
				f[i].delete();
			}
		}
		folder.delete();
	}

}
