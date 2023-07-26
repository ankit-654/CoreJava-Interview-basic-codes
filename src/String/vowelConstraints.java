package String;

public class vowelConstraints {

	static void Solve(String str, int n ) {
		int Vowels=0,Consonant=0,WhiteSpaces=0;
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u') {
				Vowels++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				Consonant++;
			else if(str.charAt(i)==' ')
				WhiteSpaces++;
		}
		System.out.println(Vowels);
		System.out.println(Consonant);
		System.out.println(WhiteSpaces);
	}
	public static void main(String[] args) {
		String str="Hey I m Ankit Anand";
		str=str.toLowerCase();
		int n=str.length();
		Solve(str, n);
	}
}
