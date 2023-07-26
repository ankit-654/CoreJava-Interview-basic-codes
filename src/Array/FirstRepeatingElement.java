package Array;

public class FirstRepeatingElement {
	public static int firstRepeatingele(int arr[] ,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					return i;
				}
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,9,2};
		int n=arr.length;
		int index = firstRepeatingele(arr, n);
		 
        // Checking if any repeating element is found or not
        if (index == -1) {
            System.out.println("No repeating element found!");
        }
        else {
            // Printing the first repeating element and its index
            System.out.println("First repeating element is " + arr[index]);
        }

	}

}
