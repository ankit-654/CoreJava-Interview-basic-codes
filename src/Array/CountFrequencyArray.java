package Array;

public class CountFrequencyArray {

	private static void CountFrequency(int[] arr, int n) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[n];
			for(int i=0;i<n;i++) {
				if (visited[i]==true) 
					continue;

				int count=1;
				for(int j=i+1;j<n;j++) {
					if(arr[i] == arr[j]) {
						visited[j]=true;
						count++;
					}
				}
				System.out.println(arr[i]+" occured "+count+" times");
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]= {10,3,3,10,10,12,12,12,12,11};
 int n=arr.length;
 CountFrequency(arr,n);
	}

	

}
