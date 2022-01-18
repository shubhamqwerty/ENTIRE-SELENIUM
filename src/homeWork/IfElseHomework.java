package homeWork;

public class IfElseHomework {
	
	
	public static void main(String[] args) {
		m1(44);
}

	
	public static void m1(int a)
	{
		if(a>=0 && a<=20) 
		{
			System.out.println("a value is between 0 to 20");
		}
		else if(a>=21 && a<=40)
		{	
			System.out.println("a value is between 21 to 40");
		}
		else if(a>=41 && a<=60)
		{
			System.out.println("a value is between 41 to 60");
		}
		else if(a>=61 && a<=80)
		{
			System.out.println("a value is between 61 to 80");
		}
		else if(a>=81 && a<=100)
		{
			System.out.println("a value is between 81 to 100");
		}
		
		else
		{
			System.out.println("a value is above 100 ");
		}
	}
	
	
	
	
}
