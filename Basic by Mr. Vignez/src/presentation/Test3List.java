package presentation;

import java.io.File;
/*
Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname. 
If this abstract pathname does not denote a directory, then this method returns null. Otherwise an array of File objects is returned,
 one for each file or directory in the directory. Pathnames denoting the directory itself and the directory's parent directory are not included in the
  result.

 */
public class Test3List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o = new File("D:\\stream\\");
		if(o.exists()) {
			File a[] = o.listFiles();
			for(int i=0; i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
		else {
			System.out.println("There are no file exist");
		}
	}

}
