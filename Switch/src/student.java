
public class student {
	int roll;
	String name;
	static String cname="B.J.S COLLEGE";
	student(int x,String y){
		roll=x;
		name=y;
		
		
	}
	void display() {
		System.out.println("Roll No="+roll+  "Student Name="+name+   "College Name ="+cname);
	}
	
	

	

	public static void main(String[] args) {
		student st=new student(101,"jivesh");
		student sd=new student(102,"deepak");
		st.display();
		sd.display();


	}

}
