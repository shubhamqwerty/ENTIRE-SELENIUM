package VariableDisscussion;

public class NonStaticVariable {

	int g=24;
	
	public static void main(String[] args) {
		 //to call non static variable we have to make object
		
		
		NonStaticVariable Z = new NonStaticVariable();
		 System.out.println(Z.g);
		
		m1();
	}
	
	public static void m1()
	{   // calling a nonstatic variable in static method
		
		NonStaticVariable T= new NonStaticVariable();
		
		System.out.println(T.g);//24
	System.out.println("***********************");
	
		
		//to acces g and changing its value
		
		T.g=97; //accessing value of g and changing it
		System.out.println("updated g value : "+T.g);//97
		
		System.out.println("*******");
		
		
		NonStaticVariable  var =new NonStaticVariable();
		
		System.out.println(var.g);//24
		
		var.g=var.g+3484;
		
		System.out.println("updated var.g "+var.g);
		
	}
	
	
	public void m2()
	{ //to call a non static variable in non static method we can call directly without creating an object
		int g=24;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
