package Package1;

public class Arithmetic {
	
	//(10-2)(10+2)/100
	public int sum(int a,int b) {
		
		int c;
		c=a+b;
		System.out.println("Sum Result is "+c);
		return c;
	
	}
	
public int sub(int d,int e) {
		
		int f;
		f=d-e;
		System.out.println("subtraction Result is "+f);
		return f;
	
	}

public int mul(int g,int h) {
	
	int i;
	i=g*h;
	System.out.println("Multiplication result is "+i);
	return i;

}

public float divide(float j) {
	float l;
l=j/100;
System.out.println("Final result is "+l);
return l;



}

public static void main(String[] args) {
	
	Arithmetic ar=new Arithmetic();
	
	int sumResult=ar.sum(10, 20);
	int subResult=ar.sub(100, 45);
	int mulResult=ar.mul(sumResult, subResult);
	ar.divide(mulResult);
	
	

	
	
}

}
