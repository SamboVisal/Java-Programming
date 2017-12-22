package NumberMethod;

public class toString {
//The method is used to get a String object representing the value of the Number Object.
/*
 * If the method takes a primitive data type as an argument, then the String object representing the primitive data type value is returned.
 * If the method takes two arguments, then a String representation of the first argument in the radix specified by 
 	the second argument will be returned.
 	toString(): This returns a String object representing the value of thisInteger.
	toString(int i): This returns a String object representing the specified integer.
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 5;
		System.out.println(x.toString());
		System.out.println(Integer.toString(20));
	}

}
