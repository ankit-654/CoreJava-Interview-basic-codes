package Array;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {4,5,8,6,2,1,7};
			int max=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			System.out.println(max);

	}

}
