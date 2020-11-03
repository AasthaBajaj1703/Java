package cogni;
/**This class inherits the Shapes class and 
 * overrides its methods calculateArea() & calculatePerimeter()
 * @param radius radius of circle 
 * @return area and perimeter of circle
 * @author Lenovo
 *
 */
public class Circle extends Shapes {								
	double radius;
	
	/**
	 * @return area of circle
	 */
	public double calculateArea() {									
		double area = Math.PI*radius*radius;										//Math.PI = 3.14
		return(area);
	}
	
	/**
	 * @return perimeter of circle
	 */
	public double calculatePerimeter() {							
		double perimeter = 2*Math.PI*radius;
		return(perimeter);
	}

}
