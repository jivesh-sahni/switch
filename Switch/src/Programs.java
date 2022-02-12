
import java.util.*;

public class Programs
{

	public static  void main(String[] args)
	{
		int ch;
		do 
		{
			
		
		Scanner sc= new Scanner(System.in);
		demo acc=new demo();
		
		System.out.println("Enter Your choice:- \n1> Sum of Digit \n2> Product of Digit \n3> Exit \n4> Table \n5> Reverse \n Enter Choice Number");
		ch=sc.nextInt();
		
		switch(ch)
		{
		
		case 1:
			acc.getdata();
			acc.SumofDigit();
			break;
		case 2:
			acc.getdata();
			acc.ProductofDigit();
			break;
		case 3:
			break;
		case 4:
			acc.getdata();
			acc.TableGivenNumber();
			break;
		case 5:
			acc.getdata();
			acc.Reverse();
			break;
			
			default:
				System.out.println("Invaled Data");
			break;
			
		}
		
		}
		while(ch!=3);
		
		 
		
	

	}

}

class demo {
	int n;

	void getdata() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		n = in.nextInt();
	}

	void SumofDigit() {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("Sum of Digit =" + sum);
	}

	void ProductofDigit()
	{
		int pro = 1, digit;
		while (n > 0) {
			digit = n % 10;
			pro = pro * digit;
			n = n / 10;

		}
		System.out.println("Product of Digit = " + pro);
	}
	void TableGivenNumber()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(+n+ "x" +i+ "="+(n*i));
			
		}
		
	
	}
	void Reverse()
	{
		int rev=0;
		while(n>0)
		{
			
			rev=rev*10+(n%10);
			n=n/10;
		}
		System.out.println("Reverse Number :"+rev);
	}

}
