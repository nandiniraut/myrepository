
class Box 
{ 
	double width, height, depth; 

	
	Box(double w, double h, double d)  //1st constructor
	{ 
	    width = w; 
	    height = h; 
	    depth = d; 
	} 

	 
	Box()  // second constructor
	{ 
	    width = height = depth = 0; 
	} 

	 
	Box(double len)  // third constructor, overloading happens here
	{ 
	    width = height = depth = len; 
	} 

	
	double volume() //function to calculate volume
	{ 
	    return width * height * depth; 
	} 
} 


public class Test 
{ 
	public static void main(String args[]) 
	{ 
	    Box mybox1 = new Box(10, 20, 15); 
	    Box mybox2 = new Box(); 
	    Box mycube = new Box(7); 

	    double vol; 

		
	    vol = mybox1.volume(); 
	    System.out.println(" Volume of mybox1 is " + vol); 

		
	    vol = mybox2.volume(); 
	    System.out.println(" Volume of mybox2 is " + vol); 

		
	    vol = mycube.volume(); 
	    System.out.println(" Volume of mycube is " + vol); 
	} 
} 
