package VariableDisscussion;

public class Staticvariable {

	static int f=23;
	
	public static void main(String[] args) {
		
		System.out.println(f);  //1st way to access static variable
		System.out.println(Staticvariable.f); //2nd way to access static variable
		
		//too change value of variable---
		
		f=f+345; //updated value of f
		
		System.out.println(f);
		
		m1();
		
	}
	 public static void m1()
	 {   ///calling static variable in static method
		 System.out.println(f);
	 }
	
	public void m2()
	{  // calling static variable inside non static method we can call directly
		System.out.println(f);
	}
	
	
     
	 
	 
	
	
	
	
	
	
	
	
	
	
}
