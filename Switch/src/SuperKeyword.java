class Animal{
	void move() {
		System.out.println("Animal can move...");
		
	}
}
class cat extends Animal{
	void move() {
		super.move();
		System.out.println("Cats can walk and move");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ac=new cat();
		ac.move();

	}

}
