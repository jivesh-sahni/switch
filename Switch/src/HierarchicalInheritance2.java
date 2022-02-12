import java.util.*;
class A2{
	int a,b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first no:");
		a=sc.nextInt();
		System.out.println("Enter your second no:");
		b=sc.nextInt();
		
	}
	
}
class B2 extends A2{
	void add() {
		System.out.println("Addtion = "+(a+b));
	}
}
class C2 extends A2{
	void substract() {
		System.out.println("Substraction ="+(a-b));
	}
}
public class HierarchicalInheritance2 {

	public static void main(String[] args) {
		B2 jv=new B2();
		C2 jv2=new C2();
		jv.input();
		jv.add();
		jv2.input();
		
		jv2.substract();
		// TODO Auto-generated method stub

	}

}
