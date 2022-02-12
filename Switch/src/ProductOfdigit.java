import java.util.*;
public class ProductOfdigit {

	public static void main(String[] args) {
		
		Scanner pd=new Scanner(System.in);
		int n,product=1;
		System.out.println("Enter Your Number:-");
		n=pd.nextInt();
		while(n>0)
		{
			product=product*(n%10);
			n=n/10;
		}
		System.out.println("Product of Digit = "+product);

	}

}
