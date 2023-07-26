package ParaProgramPractice;

import java.util.Scanner;

public class Demo2 {
 public static int SolveProblem(String str) {
	 if(str == null) return -1;
	 int res=str.charAt(0)-0;
	 for(int i=1;i<str.length();) {
		 char prev=str.charAt(i);
		 i++;
		 if(prev == 'A') 
			 res=res&str.charAt(i)-'0';
		 else if(prev=='B')
			 res=res| str.charAt(i)-'0';
		 else
			 res=res^(str.charAt(i)-'0');
		 i++;
		 }
	 
	 return res;
 }
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//	    String str=sc.next();
		String str="1A0C0B1A0";
	    System.out.println(SolveProblem(str));
	}
}
