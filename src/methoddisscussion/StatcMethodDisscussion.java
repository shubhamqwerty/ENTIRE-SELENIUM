package methoddisscussion;

public class StatcMethodDisscussion {
	
	public static void areaOfTriangle()
	{
		int base = 122;
		int height = 3738;
		double area = 0.5* base*height;
		
		System.out.println("area of triangle "+ area);
		toDeterminePrice();// calling static method in static of same class
		
	}
	
	 public static void toDeterminePrice()
	 {
		 int price=234;
		 int totalgoods= 12;
		 double discount=0.25;
		 
		double finalprice= price*totalgoods*discount;
		
		System.out.println("the final price is:"+finalprice);
		
		System.out.println("*****************");
		
		NonStaticMethodDisscussion2 h = new NonStaticMethodDisscussion2();
		h.circle();// calling a non static method into a static method
		
		
	 }
	
	
	
	public static void main(String[] args) {
		
		areaOfTriangle();//calling directly
		StatcMethodDisscussion.areaOfTriangle();//2nd way of calling
		toDeterminePrice();
		StatcMethodDisscussion.toDeterminePrice();
		
		StaticMethodDisscussion2.findTheAverage();//calling static method from another class
		
		StatcMethodDisscussion q= new StatcMethodDisscussion();
		q.areaOfTriangle();// calling static method of same class in non static way
		q.toDeterminePrice();
				
		
		
	}
	

}
