package Number;
import java.util.Scanner;

public class PerfectSquare {
 static boolean CheckPerfectSquare(double number) {
	 double sqrt=Math.sqrt(number);
			 
	 return ((sqrt - Math.floor(sqrt)) == 0); 
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number: ");  
		Scanner sc=new Scanner(System.in);
		double number=sc.nextDouble();
		if(CheckPerfectSquare(number)) {
			System.out.println("perfect square");
		}else {
			System.out.println("not perfect square");	
		}
	}

}
