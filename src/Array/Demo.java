package Array;

import java.util.Arrays;

public class Demo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,5,9,8,4,3};
		int n=arr.length;
        int temp;
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[i]<arr[j]) {
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        	
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }
	}

}
