package registrationdetails;
import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		String name;
		int age;
		long phoneno;
		String qualification;
		String email;
		String experience;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		name = sc.next();
		System.out.print("Enter your age:");
		age = sc.nextInt();
		System.out.print("Enter your phoneno:");
		phoneno = sc.nextLong();
		System.out.print("Enter your qualification:");
		qualification = sc.next();
		System.out.print("Enter your email id[Please provide valid id, after registering your registration id will be mailed]:");
		email = sc.next();
		System.out.print("Enter your noofexperience:");
		experience = sc.next();
		Output output = new Output();
		output.display(name, email);
		sc.close();
	}

}
