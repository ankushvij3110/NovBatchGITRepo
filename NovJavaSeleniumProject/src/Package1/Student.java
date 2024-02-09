package Package1;

public class Student {
int a;
	public void ankush() {
		
		System.out.println("Welcome to the java world Ankush");
		
	}
public void ankush(int a) {
		
		System.out.println("this is the variable in ankush() "+ a);
		
	}
	
	
	public static void main(String[] args) {
		Student stdnt=new Student(); //stdnt is the reference variable
		stdnt.ankush();
		stdnt.a=777;
		System.out.println("Value of a is "+stdnt.a);
		stdnt.ankush(87);
	}
	
	
}
