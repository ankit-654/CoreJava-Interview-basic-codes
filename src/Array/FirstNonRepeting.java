package Array;

public class FirstNonRepeting {
	 static int FirstnonRep(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int j;
			for( j=0;j<n;j++)
				if(i!=j && arr[i]==arr[j])
					break;
				 
				if(j==n)
					return arr[i];
			
		}
		return -1;
		
	}
   public static void main(String[] args) {
	int arr[]= {1,2,2,3,6,5,5,4};
	int n=arr.length;
	System.out.println(FirstnonRep(arr, n));
}
}
