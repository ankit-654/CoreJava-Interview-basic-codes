import java.util.Scanner;

public class StringPalindorome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");

		String input=scanner.nextLine();
		if(isPalindrome(input)) {
			System.out.println((input)+" is palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		int left=0,right=str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
