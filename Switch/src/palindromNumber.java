import java.util.*;
public class palindromNumber {

	public static void main(String[] args) {
		Scanner pn=new Scanner(System.in);
		int n,rev=0,z;
		System.out.println("Enter your Number:-");
		n=pn.nextInt();
		z=n;
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		if(rev==z)
			System.out.println("Palindrom Number");
		else
			System.out.println("Not Palindrom Number");

	}

}
