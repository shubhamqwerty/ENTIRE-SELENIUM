package methoddisscussion;

public class NonStaticMethodDisscussion {
	
	public void percentageCalculation()
	{
		int maths=63;
		int english= 74;
		int geography= 67;
		int history=26;
		
		int percentage= (maths+english+geography+history)*100/400;
		
		System.out.println(percentage);
		
		velocity();// we can directly call one non static method into another nonstatic method
	}
	
	
	public void velocity()
	{
		 int a=12;
		 int u=25;
         int t =72;
         int s=u +(a*t);
         
         System.out.println(s);
         
         m1();// calling static inside nonstatic
         
         percentageCalculation();// calling non static method in non static method : can call directly because both of them are in same class
         
	}
	
	public static void m1()
	{
		System.out.println("m1 is running");
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		NonStaticMethodDisscussion k =new NonStaticMethodDisscussion();
		 
		 
		 k.velocity();
		
	}

}
