import java.util.*;
class A{
	int a;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		a=sc.nextInt();
		
	}
}
class B extends A{
	int b;
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		b=sc.nextInt();
		
	}
}
class C extends B{
	int c;
	void add() {
		c=a+b;
		System.out.println("Addition ="+c);
	}
	
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C t=new C();
		t.input();
		t.getdata();
		t.add();

	}

}
