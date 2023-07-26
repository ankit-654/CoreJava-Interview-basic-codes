package ParaProgramPractice;

import java.util.Scanner;

public class Demo5 {
	static int differenceofSum(int m,int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=m;i++) {
			if(i%n==0) 
				 sum1=sum1+i;
			else 
				sum2=sum2+i;
		}
		return sum1-sum2;  //Math.abs just returns the absolute value of a number
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(differenceofSum(m, n));
		
	}
}
