package methoddisscussion;

public class NonStaticMethodDisscussion2 {

	
	public void circle()
	{
		double radius = 23.53;
		
		double area = Math.PI*radius*radius;
		
		System.out.println("Area of circle is :" + area);
		
		StaticMethodDisscussion2.findTheAverage();//calling static method from another class into nonstatic method
		
	   perimeterOfCircle();
	}
	
	public static void perimeterOfCircle()
	{
		double radius= 34.584;
		 double perimeter = 2*Math.PI*radius;
		 
		 System.out.println("perimeter of circle : "+ perimeter);
		 
		 
		
	}
	
	
	
	
	
	
	 public static void main(String[] args) {
		
		 NonStaticMethodDisscussion2 c = new NonStaticMethodDisscussion2();
		 c.circle();
		 
		 System.out.println("**************");
		 
		 NonStaticMethodDisscussion v = new NonStaticMethodDisscussion();
		 v.velocity();
		 v.percentageCalculation();
	}
	
	
	
	
}
