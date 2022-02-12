import java.util.*;
public class factrorial {

	public static void main(String[] args) {
		Scanner fl =new Scanner(System.in);
		int n,fac=1;
		System.out.println("Enter Your Number :- ");
		n=fl.nextInt();
		while(n>0)
		{
			fac=fac*n;
			n=n-1;
			
		}
		System.out.println("Factorial= " +fac);

	}

}
