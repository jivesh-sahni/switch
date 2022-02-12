class A1{
	void methodA() {
		System.out.println("Method of class A");
	}
	
}
class B1 extends A1{
	void methodB() {
		System.out.println("Method of class B");
		
	}
}
class C1 extends A1{
	void methodC() {
		System.out.println("Method of class C");
	}
}
class D1 extends A1{
	void methodD() {
		System.out.println("Method of class D");
	}
	
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		B1 jv=new B1();
		C1 jv2=new C1();
		D1 jv3=new D1();
		
		
		jv.methodB();
		jv2.methodC();
		jv3.methodD();
		
		

	}

}

