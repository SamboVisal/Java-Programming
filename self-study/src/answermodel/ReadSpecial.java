package answermodel;

public class ReadSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String name = "!@pisal#";
		char c[] =name.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!(c[i]>='a'&&c[i]<='z' || c[i]>='A'&&c[i]<='Z')) {
				count++;
				System.out.println(c[i]);
			}
			
		}
		System.out.println(count);
		
	}

}
