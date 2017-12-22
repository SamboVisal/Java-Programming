package NumberMethod;

public class parse {
//This method is used to get the primitive data type of a certain String. parseXxx() is a static method and can have one argument or two.
/*
 parseInt(String s): This returns an integer (decimal only).
 parseInt(int i): This returns an integer, given a string representation of decimal, binary, octal, 
or hexadecimal (radix equals 10, 2, 8, or 16 respectively) numbers as input.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "490";
		int x = Integer.parseInt(name);
		double y = Double.parseDouble("80.5");
		int i = Integer.parseInt("400",16);
		System.out.println(x);
		System.out.println(y);
		System.out.println(i);
	}

}
