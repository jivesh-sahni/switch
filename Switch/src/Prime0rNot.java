import java.util.*;
public class Prime0rNot {

	public static void main(String[] args) {
		Scanner pn=new Scanner(System.in);
		int n,count=0,i=1;
		System.out.println("Enter Your Number");
		n=pn.nextInt();
		while(i<=n)
		{
			if(n%i==0)
				count=count+1;
			i=i+1;
		}
			if(count==2)
				System.out.println(" Prime Number");
			else
				System.out.println("Not Prime Number");
			
		
		

	}

}
