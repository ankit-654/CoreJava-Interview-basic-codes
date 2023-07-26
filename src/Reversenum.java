import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,rem,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Make Entry");
num=sc.nextInt();

while(num!=0) 
{
    rem = num%10;
    rev = (rev*10) + rem;
    num = num/10;
 }
System.out.println("Reverse "+rev);

	}

}
