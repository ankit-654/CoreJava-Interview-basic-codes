package Array;

public class Insert_Element {

	public static void main(String args[]) {
		
		// index positioning
		int [] a= {10,20,30,40,50,60,70,80,90};
		int idx_ele=5;
		int element=100;
		for(int i=a.length-1;i>idx_ele-1;i--) 
		{
			a[i]=a[i-1];
		}
		a[idx_ele]=element;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
	}
}
