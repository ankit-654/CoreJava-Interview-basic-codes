package Array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {4,8,5,7,9,6,3};
//   int n=arr.length;
   int temp=0;
   for (int i = 0; i < arr.length; i++) {     
       for (int j = i+1; j < arr.length; j++) {     
          if(arr[i] < arr[j]) {    
              temp = arr[i];    
              arr[i] = arr[j];    
              arr[j] = temp;    
          }     
       } 
   }  
   for (int i = 0; i < arr.length; i++) {     
       System.out.print(arr[i] + " ");    
   }  
  
	}

}
