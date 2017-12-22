package CharacterClass;

public class Quotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s = 'A';
		System.out.println("Your name is \"pisal\" ");
		System.out.println(Character.isLetter('p'));
		System.out.println(Character.isLetter('4'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('4'));
		System.out.println(Character.isUpperCase(s));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isLowerCase(s));
	}

}
