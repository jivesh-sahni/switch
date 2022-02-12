import java.util.*;
public class TableGivenNumber {

	public static void main(String[] args) {
		Scanner tgn=new Scanner(System.in);
		int n,i;
		System.out.println("Enter Your Number:- ");
		n=tgn.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(+n+" X "+i+"="+(n*i));
		}

	}

}
