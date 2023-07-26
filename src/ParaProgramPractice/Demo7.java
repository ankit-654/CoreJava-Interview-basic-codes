package ParaProgramPractice;

import java.util.Scanner;

public class Demo7 {

	static int ProductSmallestPair(int arr[],int n) {
		if(n<2) return 0;
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			 arr[i]=sc.nextInt();
	}
}
