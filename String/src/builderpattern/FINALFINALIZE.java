package builderpattern;

public class FINALFINALIZE {
	public  int a =15;
	public void output() { 
		System.out.println("Method 1");
		a=1;
		System.out.println(a);
	}
	public void output1() {
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5; int b =0,result=0;
		FINALFINALIZE f = new FINALFINALIZE();
		System.out.println(a);
		f.output();
//		try {
//			result = 10/0;
//			System.out.println(result);
//		}
//		finally {
//			System.out.println("End of try catch");
//		}
	
	}

}
