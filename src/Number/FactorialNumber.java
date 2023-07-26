package Number;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac=fac*i;
		}
		System.out.println("Factorial Of "+num +" is "+fac);
	}

}
