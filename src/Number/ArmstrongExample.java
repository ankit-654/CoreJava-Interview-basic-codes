package Number;
import java.util.Scanner;

public class ArmstrongExample {

	public static void main(String[] args) {
    int temp,rem,p=0;
    int n=1634;
    temp=n;
    while(n>0) {
    	rem=n%10;
    	p=(p)+(rem*rem*rem);
    	n=n/10;
    	}
    	if(temp==p) {
    		System.out.println("Number is Armstrong");
    	}
    	else {
    		System.out.println("Not A Armstrong");
   	
    }
		
//		int num,temp,totaldigit=0,res=0,rem,pow,i;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Make a Entry");
//		num=sc.nextInt();
//		temp=num;
//		while(num>0) {
//			num=num/10;
//			totaldigit++;
//		}
//		num=temp;
//		while(num>0) {
//			rem=num%10;
//			pow=1;
//			i=0;
//			while(i<totaldigit) {
//				pow=pow*rem;
//				i++;
//			}
//			res=res+pow;
//			num=num/10;
//		}
//		if(res==temp) {
//			System.out.println("it is");
//		}
//		else {
//			System.out.println("not");
//		}
//		
//	}
//	
//
//}
		int num = 7, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}