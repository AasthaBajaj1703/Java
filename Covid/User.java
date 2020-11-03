package Covid;
import java.util.Scanner;

/**This class contains the main() method. It interacts with the user 
 * and takes the input for the Covid Patient
 * @param Name Patient's name
 * @param Dob Patients's date of birth
 * @param Bloodgroup Patient's blood group
 * @param Report Patient's Covid test report
 * @param Address Patient's home address
 * @param Telephone Patient's mobile or telephone number
 * @param Adhaar Patient's Adhaar number
 * @param Age Patient's Age
 * @param choice to take user's choice (Y/N) for the continuation after adding one record
 * @author Lenovo
 *
 */
public class User {

	public static void main(String[] args) {
		String name;
		String dob;
		String bloodgroup;
		String report;
		String address;
		String telephone;
		long adhaar;
		int age;
		char choice;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Patient Name : ");
			name = sc.next();
			System.out.println("Patient's Age : ");
			age = sc.nextInt();
			System.out.println("Date of Birth : ");
			dob = sc.next();
			System.out.println("Blood Group : ");
			bloodgroup = sc.next();
			System.out.println("Test Report : ");
			report = sc.next();
			System.out.println("Contact Address : ");
			address = sc.next();
			System.out.println("Telephone Number : ");
			telephone = sc.next();
			System.out.println("Adhaar Number : ");
			adhaar = sc.nextLong();
		
			CovidPatient covidPatient = new CovidPatient(name,age,dob,bloodgroup,report,address,telephone,adhaar); 
			covidPatient.display();
			System.out.println("Do you want to add another record(Y/N)?");
			choice = sc.next().charAt(0);
			sc.close();
		}while(choice=='Y');
	}

}
