
public class defualContructor {
	int rollno;
	int marks1;
	int marks2;
	int total;
	defualContructor(){ //no-argument constructor & default constructor
		rollno=2;
		marks1=50;
		marks2=30;
		
		
		
	}
	int Total(){// method to Calculate total
		total=marks1+marks2;
		return total;
		
	}
	//method to display Result
	void display() {
		System.out.println("Student Roll No:-"+rollno);
		System.out.println("marks1 are:-"+marks1);
		System.out.println("marks2 are:-"+marks2);
		System.out.println("Total is :-"+total);
		
	}

	

	public static void main(String[] args) {
		int total1,total2,grantotal;
		defualContructor dc=new defualContructor();
		defualContructor dt=new defualContructor();
		total1=dc.Total();
		total2=dt.Total();
		grantotal=total1+total2;
		dc.display();
		dt.display();
		System.out.println("Gran Total ="+grantotal);
		
		

	}

}
