package String;

public class removeSpace {

	 static String removeSpace(String str) {
//	    {
//	        str = str.replaceAll("\\s","");
//	        \\s is used for replacing 1 or more spaces.
//	        replace.All replaces all occurrences of a String in another String matched by regex.
	        for(int i=0;i<str.length();i++) {
	        	char ch=str.charAt(i);
	        	if(ch==' ') {
	        		str=str.substring(0, i)+str.substring(i+1);
	        		i--;
	        	}
	        }
	        return str;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ankit anand";
		System.out.println(removeSpace(str));
	}

}
