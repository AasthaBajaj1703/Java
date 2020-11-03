package alphabets;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		int[] num = new int[4];
		//char alphabet[] = new char[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits:");
		for(int i=0;i<4;i++) {
			num[i] = sc.nextInt();
		}
		Output output = new Output();
		output.display(num);
		sc.close();
	}

}
