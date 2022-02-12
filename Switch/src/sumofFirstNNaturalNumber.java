import java.util.*;
public class sumofFirstNNaturalNumber {

	public static void main(String[] args) {
		
		Scanner nn=new Scanner(System.in);
		int i,n,add=0;
		System.out.println("Enter your Number:-");
		n=nn.nextInt();
		i=1;
		while(i<=n)
		{
			add=add+i;
			i=i+1;
		}
		System.out.println("Addtion = "+add);
		
		

	}

}
