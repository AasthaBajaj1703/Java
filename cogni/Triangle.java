package cogni;

/**This class inherits the Shapes class and 
 * overrides its methods calculateArea() & calculatePerimeter()
 * @param height height of triangle
 * @param base length of base of triangle
 * @param side1 length of one side of triangle
 * @param side2 length of second side of triangle
 * @return area and perimeter of triangle
 * @author Lenovo
 *
 */
public class Triangle extends Shapes {													
	
		double height;
		double base;
		double side1;
		double side2;
		
		/**
		 *@return area of triangle
		 */
		public double calculateArea() {													
			double area = 0.5*height*base;
			return(area);
		}
		/**
		 *@return perimeter of triangle
		 */
		public double calculatePerimeter() {											
			double perimeter = base+side1+side2;
			return(perimeter);
		}

}
