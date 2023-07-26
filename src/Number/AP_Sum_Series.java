package Number;

public class AP_Sum_Series {
//    int n=5;
//    double a,d;
	static double Ap( double a, double d,int n) {
		 double sum = 0.0;
		    for (int i = 1; i <= n; i++)
		    {
		        sum += a;
		        a += d;
		    }
		    return sum;
		    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a = 1.5, d = 3;
		    int n = 5;
		    System.out.println("Sum of Given Ap Series: "+Ap(a, d, n));
	}

}
