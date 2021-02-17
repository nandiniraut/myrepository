
public class Sum { 

	
	public int sum(int x, int y)  // method takes 2 int values, ruturns sum
	{ 
		return (x + y); 
	} 


	public int sum(int x, int y, int z)  // method takes 3 int values, ruturns sum
	{ 
		return (x + y + z); 
	} 

	
	public double sum(double x, double y) // method takes 2 double values, ruturns sum
	{ 
		return (x + y); 
	} 

	
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 
