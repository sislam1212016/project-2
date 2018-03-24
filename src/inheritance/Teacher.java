package inheritance;

public class Teacher extends Student {

	//	name, gender, id, display
	
	String qualification;
	
	void display2() {
		
		display();
		System.out.println("qualification : "+ qualification);
	
	}
}
