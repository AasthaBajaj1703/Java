package highestplacement;
 import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		int cse;
		int ece;
		int mech;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		cse = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		ece = sc.nextInt();
		System.out.println("Enter the no of  students placed in MECH:");
		mech = sc.nextInt();
		
		Calculate calculate = new Calculate();
		calculate.findHighest(cse,ece,mech);
		sc.close();
	}

}
