package Stringmethod;

public class stingformat {

	public static void main(String[] args) {
		int intVar = 10; float floatVar=20; String stringVar = "Pisal";
		// TODO Auto-generated method stub
		System.out.printf("The value of the float variable is " +
				"%f, while the value of the integer " +
				"variable is %d, and the string " +
				"is %s", floatVar, intVar, stringVar);
		//instead of
		String fs = String.format("\nThe value of the float variable is " +
				"%f, while the value of the integer " +
				"variable is %d, and the string " +
				"is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}

}
