
public class SmallEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,23,45,75};
System.out.println("the greatest element ="+GreatestElement(arr1));
	}

	static int GreatestElement(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
	
		return max;
	}

}
