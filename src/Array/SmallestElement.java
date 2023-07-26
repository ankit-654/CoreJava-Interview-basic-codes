package Array;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {4,8,5,9,6,2,1,4,7,0};
         int min=arr[0];
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]<min) {
        		min=arr[i];
        	 }
         }
         System.out.println(min);
	}

}
