import java.util.*;
public class firstSwitch {
	public static void main(String[] args) {
		Scanner sw= new Scanner(System.in);
		int a,b,ch;
		System.out.println("Enter Your First Number");
		a=sw.nextInt();
		System.out.println("Enter Your Second Number");
		b=sw.nextInt();
		System.out.println("Enter Your Choice \n 1>add \n2> Minus \n3> Multiply \n4> Divide \nEnter Your Choice:-");
		ch=sw.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Addtion = "+(a+b));
			break;
		case 2:
			System.out.println("Minus = "+(a-b));
			break;
		case 3:
			System.out.println("Multiply = "+(a*b));
			break;
		case 4:
			System.out.println("Divide = "+(a/b));
			break;
			default:
				System.out.println("Invalid Choice");
				break;
		
			
		
		}
		
	}

}
