package methoddisscussion;

public class WithoutReturnWithArguments {

	public void m2(int i)
	{
		System.out.println("here m2 is running :"+ i);
	}
	
	
	
	public void areaOfRectangle( int length, int breadth)
	{
		int area=length*breadth;
		
		System.out.println("Area of rectangle: "+ area);
	}
	
	public static void perimeterOfSquare(int side)
	{
		 int Permimeter = 4*side;
		 
		 System.out.println("Perimeter of square: "+ Permimeter);
	}
	
	
	public static void main(String[] args) {
		WithoutReturnWithArguments var = new WithoutReturnWithArguments();
		var.m2(346645674);
		var.areaOfRectangle(4874, 4847);
		perimeterOfSquare(2425);
		
	}
	
	
}
