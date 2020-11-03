package luckynumber;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		int number;
		System.out.print("Enter the car no:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		Output output = new Output();
		output.findLucky(number);

	}

}
