package Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "s123";
		String pattern = "(.*)(\\d+)(.*)";
		//create a pattern object
		Pattern p = Pattern.compile(pattern);
		//create matcher object
		Matcher m = p.matcher(line);
		/*
Attempts to find the next subsequence of the input sequence that matches the pattern. 
This method starts at the beginning of this matcher's region, or, if a previous invocation of the method was successful and the matcher has not since been reset, at the first character 
not matched by the previous match. 
If the match succeeds then more information can be obtained via the start, end, and group methods
		 */
//true if, and only if, a subsequence of the input sequence matches this matcher's pattern
/*
 Returns the input subsequence captured by the given group during the previous match operation. 
For a matcher m, input sequence s, and group index g, the expressions m.group(g) 
and s.substring(m.start(g), m.end(g)) are equivalent. 

 */
		if(m.find())
		{
			System.out.println("Found value " + m.group(0));
			System.out.println("Found value " + m.group(1));
			System.out.println("Found value " + m.group(3));
		}else{
			System.out.println("Not found");
		}
	}	

}
