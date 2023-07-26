package ParaProgramPractice;

import java.util.Scanner;

public class Demo1 {
	
	public static int SolveProblem(int r,int unit,int n,int arr[])
	{
		if (arr==null) return -1;
		int rest=r*unit;  // food consumption by rat
		int sum=0;  //how much food needed by rats
		int count=0; // will work as a return type to return the o/p
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];     // after sum there will be addition
			count++;          // according to for loop , it will count the index of array used  
			if(sum>=rest)   
			break;
		}
			if(sum<rest) 
				return 0; // when all houses are not sufficient for rats food
		
		return count;  // main function return type
	}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int unit=sc.nextInt();
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<n;i++) 
	  arr[i]=sc.nextInt();
  System.out.println("House needed for rats");
	  System.out.println(SolveProblem(r, unit, n, arr));  // function to solve problemoutside the main method
}
}
