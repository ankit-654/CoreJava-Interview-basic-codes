package String;

public class removeCharEXalpha {
 static String removeCharacter(String str) {
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)<'A' || str.charAt(i)>'Z' && str.charAt(i)<'a' || str.charAt(i)>'z') {
			 str=str.substring(0, i)+ str.substring(i+1);
			 i--;
		 }
	 }
	 return str;
//	System.out.println(str);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AnkitAnand%@10";
		str=str.toLowerCase();
//		removeCharacter(str);
//		System.out.println(n);
		System.out.println(removeCharacter(str));
	}

}
