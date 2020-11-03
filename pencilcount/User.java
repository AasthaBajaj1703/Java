package pencilcount;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		int standard;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the standard:");
		standard = sc.nextInt();
		Calculate calculate = new Calculate();
		int pencils = calculate. findPencils(standard);
		System.out.println("Nila gets "+pencils+" pencils");

	}

}
