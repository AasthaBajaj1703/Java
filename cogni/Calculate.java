package cogni;
import java.util.Scanner;

/**This class contains the main() method.
 * Takes input for other classes for the calculation of area and perimeter
 * and print area and perimeter calculated for that shape
 * @param attempt takes the input as Y(Yes) or N(No) from the user after one calculation 
 * asking whether he/she wants to calculate again for the next shape or not
 * @param choice takes the input as 1 or 2 or 3 for Circle, Triangle, Rectangle respectively
 * @author Lenovo
 *
 */
public class Calculate {

	public static void main(String[] args) {
		char attempt;
		Scanner sc = new Scanner(System.in);
		do {		
			int choice;
			System.out.println("Press 1 for Circle\nPress 2 for Triangle\nPress 3 for Rectangle");
			System.out.println("Enter your choice:");
			choice= sc.nextInt();
			switch(choice) {																			
			case 1:
				//takes input for Circle class and print its area and perimeter
				System.out.println("Enter the radius");
				Circle c = new Circle();
				c.radius = sc.nextDouble();
				System.out.println("Area of Circle="+c.calculateArea()+"\nPerimeter of Circle="+c.calculatePerimeter());
				break;
			case 2:
				//takes input for Triangle class and print its area and perimeter
				System.out.println("Enter the height,base,side1 & side2 in the same order");
				Triangle t = new Triangle();
				t.height= sc.nextDouble();
				t.base=sc.nextDouble();
				t.side1=sc.nextDouble();
				t.side2=sc.nextDouble();
				System.out.println("Area of Triangle="+t.calculateArea()+"\nPerimeter of Triangle="+t.calculatePerimeter());
				break;
			case 3:
				//takes input for Rectangle class and print its area and perimeter
				System.out.println("Enter the length & width");
				Rectangle r = new Rectangle();
				r.length= sc.nextDouble();
				r.width=sc.nextDouble();
				System.out.println("Area of Rectangle="+r.calculateArea()+"\nPerimeter of Rectangle="+r.calculatePerimeter());
				break;
			default:
				System.out.println("Wrong Choice");
			}
			System.out.println("Do you want to calculate again?\n Press Y for YES and N for NO:");
			attempt = sc.next().charAt(0);
		}while(attempt=='Y');
		sc.close();												//IMPORTANT
	}

}
