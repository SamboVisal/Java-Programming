package NumberMethod;

public class celi {
//The method ceil gives the smallest integer that is greater than or equal to the argument.
/*
 double ceil(double d)
double ceil(float f)
This method returns the smallest integer that is greater than or equal to the argument. Returned as a double.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = -100.95;
		float f = -90;
		double c = -100.100;
		double a = -21.1;
		System.out.println(Math.ceil(d));
		System.out.println(Math.ceil(f));
		System.out.println(Math.floor(c));
		System.out.println(Math.floor(a));
	}

}
