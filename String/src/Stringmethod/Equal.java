package Stringmethod;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Sambopisal");
		String s2 = s1;
		String s3 = new String("SamboVisal");
		boolean check;
		check = s1.equals(s2);
		System.out.println(check);
		check = s2.equals(s3);
		System.out.println(check);
		//String equalsIgnoreCase() Method
		//String getChars() Method
		/*
		This method copies characters from this string into the destination character array.
		public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		srcBegin -- index of the first character in the string to copy.
 		srcEnd -- index after the last character in the string to copy.
 		dst -- the destination array.
 		dstBegin -- the start offset in the destination array.
		 */
		String st = new String("Pisal");
		char[] s = new char[10];
		try{
			st.getChars(0,5,s,0);
			System.out.print("Copies value is ");
			System.out.println(s);
		}catch (Exception x){
			System.out.println("Raised Exception");
		}
		/*************
		 
		 */
		System.out.println(st.hashCode());
		/*
		 String indexOf(int ch) Method
This method returns the index within this string of the first 
occurrence of the specified character or -1, if the character does not occur.
		public int indexOf(int ch )
		 */
		String st1 = new String("Vikirirom");
		//character
		System.out.println(st1.indexOf('V'));
		//string
		System.out.println(st1.indexOf("kiri"));
		/*
String indexOf(int ch, int fromIndex) Method
-This method returns the index within this string of the first occurrence of the specified character, 
starting the search at the specified index or -1, if the character does not occur
		 */
		//public int indexOf(int ch, int fromIndex)
		//
		//fromIndex -- the index to start the search from
		System.out.println(st1.indexOf('o',2));
		String str = new String("Sambo Visal");
		String substr1=new String("Visal");
		System.out.println(str.indexOf(substr1));
		System.out.println(str.indexOf(substr1, 10));
		//intern
		String str1 = new String("Sambo Visal");
		String str2 = new String("SAMBOVISAL");
		System.out.println(str1.intern());
		System.out.println(str2.intern().equals(str1));
		//lastindexof
		System.out.println(str2.lastIndexOf('A'));
		System.out.println(str2.lastIndexOf("VI"));
		//String lastIndexOf(int ch, int fromIndex) Method
		System.out.println(str2.lastIndexOf('A',2));
		//String length()
		System.out.println(str2.length());
		//String match()
		/*
This method tells whether or not this string matches the given regular expression.
public boolean matches(String regex)
regex -- the regular expression to which this string is to be matched.		 
This method returns true if, and only if, this string matches the given regular expression.		
		 */
		String match = new String("Java String Method");
		System.out.println("String Match Method");
		System.out.print("Regex: (.*)String(.*) matches string? " );
	    System.out.println(match.matches("(.*)String(.*)"));
	    System.out.print("Regex: (.*)Strings(.*) matches string? " );
	    System.out.println(match.matches("(.*)Strings(.*)"));
	    System.out.println(match.matches("(.*)Method"));
	    System.out.print("Regex: (.*)Methods matches string? " );
	    System.out.println(str.matches("(.*)Methods"));
	   //This method has two variants which can be used to test if two string regions are equal
	    /*
	    String regionMatches()
public boolean regionMatches(int toffset,String other,int ooffset, int len)
public boolean regionMatches(boolean ignoreCase,int toffset,String other,int ooffset,int len)
	    toffset -- the starting offset of the subregion in this string.
		 other -- the string argument.
 		ooffset -- the starting offset of the subregion in the string argument.
 		len -- the number of characters to compare.
 		ignoreCase -- if true, ignore case when comparing characters 
	It returns true if the specified subregion of this string matches the specified subregion of the string argument; false otherwise.
	 Whether the matching is exact or case insensitive depends on the ignoreCase argument.     
	     
	     */
	    String a=new String("Welcome to Cambodian.com");
	    String b=new String("Cambodia F");
	    String c=new String("CAMBODIA");
	    System.out.println("Return value ");
	    System.out.println(a.regionMatches(11, b, 0, 6));
	    //Replace()
	    //oldChar newChar... same will be replaced all
	    System.out.println(c.replace('A', 'O'));
	    //String replaceAll() Method
	    //public String replaceAll(String regex, String replacement)
	    
	    System.out.println(a.replaceAll("(.*)b(.*)", "OLD"));
	    //replaceFirst()
	    System.out.println(b.replaceFirst("(.*)Cam(.*)","odl"));
	    System.out.println(b.replaceFirst("Cam", "old"));
	    /*
	 	String split();
	 	This method has two variants and splits this string around matches of the given regular expression.
	 	public String[] split(String regex, int limit)
	 	public String[] split(String regex)
	 	regex -- the delimiting regular expression.
 limit -- the result threshold, which means how many strings to be returned
	     */
	    System.out.println("String split");
	    String split=new String("Sambo-Visal-KIT-Speu");
	    for(String retval: split.split("-",1))
	    {
	    	System.out.print(retval);
	    }
	    System.out.println("next\n");
	    for(String retval: split.split("-",2))
	    {
	    	System.out.print(retval);
	    }
	    System.out.println("next\n");
	    for(String retval: split.split("-",3))
	    {
	    	System.out.print(retval);
	    }
	    System.out.println("next\n");
	    for(String retval: split.split("-",0))
	    {
	    	System.out.print(retval);
	    }
	    System.out.println("next\n");
	    for(String retval: split.split("-"))
	    {
	    	System.out.print(retval);
	    }
	}
	}

