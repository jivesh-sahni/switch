import java.io.*;
class first{
	int val;
	void input() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number:");
		try {
			val=Integer.parseInt(br.readLine());
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			
		}
	}
		int square() {
			return(val*val);
		}
		
	
}
class second extends first{
	int mim;
	int cube() {
		mim=square()*val;
		return(mim);
	}
	
}
public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second s=new second();
		s.input();
		System.out.println("Cube="+s.cube());

	}

}
