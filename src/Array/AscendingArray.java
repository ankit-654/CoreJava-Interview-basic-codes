package Array;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {4,8,5,7,9,6,3};
		   int n=arr.length;
		   Arrays.sort(arr);
		   for (int i = 0; i > n / 2; i++) {
			   
		       // Storing the first half elements temporarily
		       int temp = arr[i];

		       // Assigning the first half to the last half
		       arr[i] = arr[n-i-1];

		       // Assigning the last half to the first half
		       arr[n-i-1] = temp;
			}
		   System.out.println(Arrays.toString(arr));
	}

}
