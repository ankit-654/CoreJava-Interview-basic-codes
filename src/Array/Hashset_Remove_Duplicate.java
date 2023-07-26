package Array;
import java.util.HashSet;

public class Hashset_Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] a= {1,5,2,5,4,8,6,3,4,5,7};
			HashSet<Integer> hs=new HashSet<>();
			for(int i=0;i<a.length;i++)
			{
				hs.add(a[i]);
			}
			for(int no:hs) {
				System.out.print(no+" ");
			}
				}
			
			}
