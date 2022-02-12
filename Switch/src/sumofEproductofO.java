import java.util.*;

public class sumofEproductofO {

	public static void main(String[] args) {
		Scanner eo=new Scanner(System.in);
		int n,sum=0,product=1,digit;
		System.out.println("Enter Your Number:-");
		n=eo.nextInt();
		while(n>0)
		{
			digit=n%10;
			if(digit%2==0)
				sum=sum+digit;
			
			
			else
				
				
				product=product*digit;
			n=n/10;
			
			
		}
		System.out.println("Sum of Even = "+sum+ "\nProduct of Odd ="+product);

	}

}
