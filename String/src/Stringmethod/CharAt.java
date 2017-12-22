package Stringmethod;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sambo Visal";
		String st = "5";
		/*
Each character of both the strings is converted into a Unicode value for comparison.
 	If both the strings are equal then this method returns 0 
 	else it returns positive or negative value.
 The result is positive if the first string is lexicographically greater than 
 the second string else the result would be negative.
		 */
		String st1 = new String("-1");
		int result = st.compareTo(st1);
		System.out.println(result);
		System.out.println(name.charAt(4));
	/*
	 This method returns a negative integer, zero, or a positive integer as the 
	 specified String is greater than, equal to, or less than this String, 
	 ignoring case considerations.	
	 */
		System.out.println("String compare ignorecase");
		int ingnore = st.compareToIgnoreCase(st1);
		System.out.println(ingnore);
		//String concat
		String s = "sambo ";
		String s1 = "pisal";
		System.out.println(s.concat(s1));
		//String contentEqual
		/*
This method returns true if and only if this String represents the same sequence 
of characters as specified in StringBuffer. 
This method returns true if and only if this String represents the same sequence of characters as the 
specified in StringBuffer, otherwise false.		 
*/
		//we can compare with stringBuffer as well contentEqual
		String m = "visal";
		String m1= "pisal";
		System.out.println("StringBuffer");
		StringBuffer m2 = new StringBuffer("visal");
		boolean re = m.contentEquals(m2);
		boolean re1 = m1.contentEquals(m);
		System.out.println(re);
		System.out.println(re1);
		
		if(re==true)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
/*
 This method returns a String that represents the character sequence in the array specified.		
 public static String copyValueOf(char[] data)
 This method returns a String that contains the characters of the character array.
 */
		char array[] = {'h','e','l','o'};
		
		String array2 = "";
		array2 = array2.copyValueOf(array);
		System.out.println(array2);
//String copyValueOf(char[] data, int offset, int count) Method
/*
 This returns a String that represents the character sequence in the array specified
 String copyValueOf(char[] data, int offset, int count)
 data -- the character array.
 offset -- initial offset of the subarray.
 count -- length of the subarray.
 */
	array2 = array2.copyValueOf(array, 1, 3);
	System.out.println(array2);
//Java – String endsWith() Method
	/*
	 This method tests if this string ends with the specified suffix.
	 endsWith(String suffix)
This method returns true if the character sequence represented by the argument is a suffix of the 
character sequence represented by this object; false otherwise. Note that the result will be true if the argument is the 
empty string or is equal to this String object as determined by the equals(Object) method.	 
	 */
		String n = new String("Pisal");
		boolean n1;
		n1 = n.endsWith("Pisal");
		System.out.println(n1);
	}

}
