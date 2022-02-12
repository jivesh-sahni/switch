import java.util.*;
// staticmamberFunction is class
public class staticmamberFunction {
	 int roll;
	String name;
	// Static data member
	static String cname="B.J.S College ";
	//void nothing return
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Roll Number:-");
		roll=sc.nextInt();
		System.out.println("Enter Your Good Name:-");
		name=sc.next();
		
	}
	
	void display() {//display is function name
		
	System.out.println("Roll no:-"+roll+"\nStudent Nmae:-"+name+"\nCollege Name:- "+cname);
		
		
		
		
	}
	//Static member Function
	static void change()
	{
		cname="marwari college Darbhanga";
	}
	
	

	public static void main(String[] args) {
//st,sd is object of class		
		staticmamberFunction st=new staticmamberFunction();
		staticmamberFunction sd=new staticmamberFunction();
		System.out.println("B.J.S COLLEGE PUNE");
		
			
		
		st.getdata();
		st.display();
		sd.getdata();
		sd.display();
		
		
		staticmamberFunction.change();
		System.out.println("if your college is marwari then");
 		st.getdata();
		
		st.display();
		
		sd.getdata();
		sd.display();
		
		
		

	}

}
