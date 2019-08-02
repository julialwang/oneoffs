//Julia Wang
//APCS Period 1

public class TextProcessor {

	public static void main(String[] args) {
	// test cases
		System.out.println(isLowerCase('a'));
		System.out.println(isLowerCase('A'));
		System.out.println(isLowerCase('1'));
		System.out.println(isLowerCase(','));
		System.out.println(toUpperCase('a'));
		System.out.println(toUpperCase('A'));
		System.out.println(toUpperCase('1'));
		System.out.println(toUpperCase(','));
		System.out.println(toUpperCase("Interlake HS"));
		System.out.println(compareToIgnoreCase("bus", "east"));
		System.out.println(compareToIgnoreCase("bus", "beast"));
		System.out.println(compareToIgnoreCase("HaWt", "CoLdEr"));
		System.out.println(compareToIgnoreCase("super", "super"));

	}
	
	public static boolean isLowerCase(char c) {
	// checks whether a character is lowercase
		if(c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}
	
	public static char toUpperCase(char c) {
	// makes a character uppercase
		if(isLowerCase(c)==true) {
			return (char) (c - ' ');
		}
		return (char) c;
	}
	
	public static String toUpperCase(String s) {
	// makes a string uppercase
		String upperCaseWord="";
		for(int i = 0; i < s.length(); i++) {
				 upperCaseWord+=toUpperCase(s.charAt(i));
		}
		return upperCaseWord;
	}
	
	public static int compareToIgnoreCase (String s, String t) {
	// compares two strings and returns difference
		String upperCaseWordS=toUpperCase(s);
		String upperCaseWordT=toUpperCase(t);
		for(int i = 0; i < s.length(); i++) {
			if(upperCaseWordS.charAt(i)<upperCaseWordT.charAt(i)) {
				return (upperCaseWordS.charAt(i)-upperCaseWordT.charAt(i));
			}
			else if(upperCaseWordS.charAt(i)>upperCaseWordT.charAt(i)) {
				return (upperCaseWordS.charAt(i)-upperCaseWordT.charAt(i));
			}
		}
		return 0;
	}

}
