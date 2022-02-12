import java.util.*;
public class SumofDigit {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter Your Number:-");
		n=sd.nextInt();
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of Digit= " +sum);
		
	}

}
