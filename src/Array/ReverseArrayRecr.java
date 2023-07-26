 package Array;

public class ReverseArrayRecr {

//	  function to print array
	public static void PrintArray(int arr[],int n) {
		System.out.println("Reversed array is:- /n");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	 function to reverse array
	public static void ReversedArray(int arr[],int start,int end) {
		  if (start < end) {
		         int tmp = arr[start];
		         arr[start] = arr[end];
		         arr[end] = tmp;
		         ReversedArray(arr, start + 1, end - 1);
		      }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int arr[]= {3,6,9,12,23};
        int n=arr.length;
        ReversedArray(arr, 0, n-1);
        PrintArray(arr, n);
	}
	
//	static void reverse(int [] a,int n) {
//		int [] b=new int[n];
//		int j=n;
//		for(int i=0;i<n;i++) {
//			b[j-1]=a[i];
//			j=j-1;
//		}
//		for(int k=0;k<n;k++) {
//			System.out.println(b[k]);
//		}
//	}
//	public static void main(String [] args) {
//		int arr []= {10,20,30,40,50};
//		reverse(arr, arr.length);
//	}
	
	
	
	
}




