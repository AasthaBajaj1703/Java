package findseason;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month:");
		month = sc.nextInt();
		Output output = new Output();
		output.display(month);
	}

}
