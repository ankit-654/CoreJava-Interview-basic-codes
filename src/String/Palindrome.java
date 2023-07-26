package String;
import java.util.Scanner;

public class Palindrome {
 static boolean palindrome(String str) {
	 int i=0,j=str.length()-1;
	  while (i<j) {
		  if(str.charAt(i)!=str.charAt(j))
			  return false;
		  i++;
		  j--;
	  }
	 return true;
 }

	public static void main(String[] args) {
		String str="abca";
		str=str.toLowerCase();
		if(palindrome(str)) 
			System.out.println("Yes");
		else System.out.println("No");
	}
}
