package String;

public class RemoveVowels {
	static  String removeVowel(String str) {
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				str=str.substring(0,i)+str.substring(i+1);
				i--;
			}
		}
		// substring == always return a new string and the original string remains unchanged beacuse
		//              string is immutable in java 
//		Immutable means unchanging over time or unable to be changed.
//		 It increases security because any hacker can't change its value and it's used
//		 for storing sensitive information such as a database username or password
		 
		return str;
		
	}
public static void main(String[] args) {
	String str="Ankit";
	System.out.println(removeVowel(str));
}
}
