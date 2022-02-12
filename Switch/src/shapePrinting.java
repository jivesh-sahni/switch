import java.util.*;
public class shapePrinting {

	public static void main(String[] args) {
		int ch;
		
		do
		{
		
		Scanner in=new Scanner(System.in);
		shapePrint sp=new shapePrint();
		System.out.println("Your Choice: \n0>Exit \n1>Star Print \n2> shape122333 \n3> shape112123 \n4>shape2344565678 \n5>Star print n to 1  \n6>shape111112222 \n7>shape23456345645 \n8>shape123451234123 \n9>star9to1print  \n10>star1to9print \n11>starprint1to9to1 \n----------------Enter Your Choice---------------\n-->");
		ch=in.nextInt();
		switch(ch)
		{
		case 0:
			break;
		case 1:
			sp.getdata();
			sp.StarPrint();
			break;
		case 2:
			sp.getdata();
			sp.shape122333();
			break;
		case 3:
			sp.getdata();
			sp.shape112123();
			break;
		case 4:
			sp.getdata();
			sp.shape2344565678();
			break;
		case 5:
			sp.getdata();
			sp.StarprintGthanlthan();
			break;
		case 6:
			sp.getdata();
			sp.shape111112222();
			break;
		case 7:
			sp.getdata();
			sp.shape234563456();
			break;
		case 8:
			sp.getdata();
			sp.shape123451234();
			break;
		case 9:
			sp.getdata();
			sp.star1Print();
			break;
		case 10:
			sp.getdata();
			sp.star1to9print();
			break;
		case 11:
			sp.getdata();
			sp.star1to9print();
			break;
			default:
				System.out.println("-----------------------Invalid Choice---------------------");
				break;
		}
		}while(ch!=0);
	
		
		

	}

}
class shapePrint{
	int n;
	void getdata() {
		Scanner jv=new Scanner(System.in);
		System.out.println("Enter a No of Row:");
		n=jv.nextInt();
		
		
	}
	void StarPrint() {
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void shape122333() {
		
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
 			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
	void shape112123() {
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
				
		}
	}
	void shape2344565678() {
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	void StarprintGthanlthan() {
		int j;
		for(;n>=0;n--)
		{
			for(j=1;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void shape111112222() {
		int j,k=1;
		for(;n>=0;n--)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(k);
			}
			k=k+1;
			System.out.println();
		}
	}
	void shape234563456() {
		int j,k=1;
		for(;n>=0;n--) 
		{
			for(j=1;j<=n;j++) 
			{
				System.out.print(k+j);
			}
			k=k+1;
			System.out.println();
		}
	}
	void shape123451234() {
		int j,k=1;
		for(;n>=0;n--)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	void star1Print() {
		
		int i,j,b;
		for(i=1;i<=n;i++)
		{
			for(b=1;b<i;b++)
				System.out.print("_");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
	void star1to9print() {
		int i,j,b;
		for(i=1;i<=n;i++) 
		{
			for(b=1;b<=n-i;b++)
				System.out.print("_");
		
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
				
			
		}
	}
	void star1to9to1() {
		int i,j,b;
		for(i=1;i<=n;i++)
		{
			for(b=1;b<=n-i;b++)
				System.out.print("_");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
			
		}
		n=n-1;
		for(i=1;i<=n;i++)
		{
			for(b=1;b<=i;b++)
				System.out.print("_");
			for(j=1;j<=2*(n-i)+1;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}






























