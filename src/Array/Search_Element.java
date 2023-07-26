package Array;

public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {6,7,9,5,3,10,-1};
		    int n = arr.length;
		    int target = 5;
		    int ans;
		    int temp=0;
		    for (int i = 0; i < n; i++) {
		      if (arr[i] == target) {
		        ans = i;
		        temp=temp+1;
		        System.out.print("The element is present in "+ans+" index");
		      }
		    }
		    if (temp==0) System.out.println("element is  not present");	    
	}

}
