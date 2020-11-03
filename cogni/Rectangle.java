package cogni;

/**This class inherits the Shapes class and
 * overrides its methods calculateArea() & calculatePerimeter()
 * @param length length of rectangle
 * @param width width of rectangle
 * @return area and perimeter of rectangle
 * @author Lenovo
 *
 */
public class Rectangle extends Shapes {									
	double length;
	double width;
	
	/**
	 *@return area of rectangle
	 */
	public double calculateArea() {											
		double area = length*width;
		return(area);
	}
	/**
	 *@return perimeter of rectangle
	 */
	public double calculatePerimeter() {									
		double perimeter = 2*(length+width);
		return(perimeter);
	}

}
