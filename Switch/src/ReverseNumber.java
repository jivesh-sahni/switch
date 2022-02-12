import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner rn=new Scanner(System.in);
		int n,rev=0;
		System.out.println("Enter yor Number :-");
		n=rn.nextInt();
		while(n>0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse Number is= " +rev);

	}

}
