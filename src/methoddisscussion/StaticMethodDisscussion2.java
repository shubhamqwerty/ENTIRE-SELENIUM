package methoddisscussion;

public class StaticMethodDisscussion2 {

public static void findTheAverage()	
{
	int a=12;
	int b=49;
	int c=124;
	int d=(a+b+c)/3;
	
	System.out.println(d);
	
	double x=1;
	double y=2;
	double n=x/y;
	
	System.out.println(n);
	
	StaticMethodDisscussion2 var= new StaticMethodDisscussion2();
	var.m2(); // calling non static inside static of same class
	
	
	}


public void m2()
{
	System.out.println("m2 method is running");
}




	public static void main(String[] args) {
		findTheAverage();
		
		StatcMethodDisscussion.areaOfTriangle();
		StatcMethodDisscussion.toDeterminePrice(); 
		
		
		
	}
}
