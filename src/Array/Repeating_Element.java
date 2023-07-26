
package Array;

public class Repeating_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {8,9,5,4,8,7,9,1,2,5};
System.out.println("repeating elements");
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
			System.out.print(arr[j]+" ");	
	}		
   }
		

  }

}
