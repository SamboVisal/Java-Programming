package NumberMethod;

public class EqualTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 5;
		Integer y = 10;
		Integer z =5;
		Short a = 5;
		System.out.println(x.equals(y));
		System.out.println(x.equals(z));
		System.out.println(x.equals(a));
		/*
		String startsWith()
This method has two variants and tests if a string starts 
with the specified prefix beginning a specified index or by default at the beginning.		
public boolean startsWith(String prefix, int toffset)
prefix -- the prefix to be matched.
 toffset -- where to begin looking in the string.
		 */
		System.out.println("String StartWith");
		String name = new String("Hello Sambo Visal");
		System.out.println(name.startsWith("Hello"));
		System.out.println(name.startsWith("Sambo",6));
		System.out.println(name.startsWith("Visal"));
		/*
		This method returns a new character sequence that is a subsequence of this sequence
		public CharSequence subSequence(int beginIndex, int endIndex)
		beginIndex -- the begin index, inclusive.
 endIndex -- the end index, exclusive.
		 */
		//char name1[]={'H','E','L','L','O'};
		System.out.println("String subsequence()");
		System.out.println(name.subSequence(0,2));
		System.out.println(name.subSequence(5,8));
		System.out.println(name.subSequence(0,4));
		System.out.println("String substring()");
		//substring no need endIndex
		System.out.println(name.substring(0));
		//toCharacterArray()
		//This method converts this string to a new character array.
		//System.out.println(name.toCharArray());
		System.out.println("exact example");
		char[] name1=name.toCharArray();
		for(char c: name1)
		{
			System.out.print(c);
		}
		System.out.println();
		//toLowerCase
		System.out.println("To Lowercase");
		String low = new String("SAMBOVISAL");
		System.out.println(low.toLowerCase());
		//System.out.println(low.toLowerCase());
		//toString()
		//This method returns itself a stri
		System.out.println("toString");
		String tos = new String("Welcome To Cambodia");
		System.out.println(tos.toString());
		//toUppercase();
		System.out.println("To Uppercase");
		String up=new String("sambovisal");
		System.out.println(up.toUpperCase());
		System.out.println("String toTrim");
		/*
		It returns a copy of this string with leading and trailing white space removed, 
		or this string if it has no leading or trailing white space.
		 */
		String trim=new String(" Welcome to cambodia bitches");
		System.out.println(trim.trim());
		//ValueOf
		System.out.println("String Valueof");
		double d = 100.22;
		boolean b = true;
		long l = 123455;
		char arr[]={'a','s','d','f','g'};
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(arr));
	}

}
