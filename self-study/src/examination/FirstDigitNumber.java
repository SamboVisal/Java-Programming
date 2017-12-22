package examination;

public class FirstDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		int first = num;
		int count=0;
		while(first>=10) {
			first = first/10;
			if(first==2) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
