package methoddisscussion;

public class WithReturnTypeWithoutArgument {
	
	
	public static boolean m1 ()
	{
		
		
		return true;
		
		
	}
	 public int m2()
	 {
		 
		 
		 int a=44;
		 int b=49;
		 int k=a+b;
		 
		 return k;
	 }
	
	 public int m3()
	 {
		 
		 
		 int a=44;
		 int b=49;
		 int k=a+b;
		 
		 return k;
	 }
	
	
	
	
	
	public static void main(String[] args) {
		 boolean var=m1();
		 
		 System.out.println(var);
		 
		 WithReturnTypeWithoutArgument X =new WithReturnTypeWithoutArgument();
		 
	       int ref	= X.m2();
	       int Y=X.m3();
	       System.out.println(ref);
	       System.out.println(Y);
	}
	
	
	
	
	
	
	
	
	

	
	
	
}
