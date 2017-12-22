package NumberMethod;

public class rint {
//The method rint returns the integer that is closest in value to the argument.
/*
 double rint(double d)
d -- it accepts a double value as parameter
This method returns the integer that is closest in value to the argument. Returned as a double.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 100.675;
		double e = 100.501;
		double f = 100.200;
		System.out.println(Math.rint(d));
		System.out.println(Math.rint(e));
		System.out.println(Math.rint(f));
	}

}
