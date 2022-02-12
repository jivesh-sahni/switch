import java.util.*;

public class Practicse 
{
	

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		Raushan in =new Raushan();
		in.getdata();
		in.Sum();
		
		
	}
}

	class Raushan {
		int n;
		void getdata()
		{
			Scanner jv = new Scanner(System.in);
			System.out.println("Enter Your Number:");
			n = jv.nextInt();

		}
		void Sum() {
			int sum=0;
			while(n>0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			System.out.println("Sum Of Digit= "+sum);
		}
	}

