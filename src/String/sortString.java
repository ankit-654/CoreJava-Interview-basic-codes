package String;

import java.util.Arrays;

public class sortString {
	static String sortString(String str) {
		char c[] = str.toCharArray();
	    Arrays.sort(c);
	    return new String(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ankit anand";
 System.out.println(sortString(str));
	}

}
