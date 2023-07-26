package String;

import java.util.Arrays;

public class Demo {

	static String sortString(String str) {
		char c[] = str.toCharArray();
	    Arrays.sort(c);
	    str.toLowerCase();
	    return new String(c);
	}
	static void Count(String str) {
		str=sortString(str);
		char ch=str.charAt(0);
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==ch) 
				count++;
			else {
				System.out.println(ch+" "+count);
				ch=str.charAt(i);
				count=1;
				
			}
		}
		System.out.print(ch+" ");
		System.out.print(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Ankit";
		str.toLowerCase();
		Count(str);
	}

}
