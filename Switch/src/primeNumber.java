import java.util.*;
public class primeNumber {

	public static void main(String[] args) {
		Scanner pn=new Scanner(System.in);
		
		int i,count,j,n,total=0;
		System.out.println("Enter Your Number:-");
		n=pn.nextInt();
		for(i=1;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==2)
			{
			
			
				System.out.println(i);
				total=total+1;
				
				}
			
				
			
		}
		System.out.println("Total="+total);		
		
		
	}

}
