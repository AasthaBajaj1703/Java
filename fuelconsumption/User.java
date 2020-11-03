package fuelconsumption;
import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumption consump = new Consumption();
		System.out.println("Enter the no of liters to fill the tank");
		Scanner sc = new Scanner(System.in);
		consump.fuel = sc.nextDouble();
		if(consump.fuel<=0) {
			System.out.println(consump.fuel+" is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter the distance covered");
		consump.distance = sc.nextDouble();
		if(consump.distance<=0) {
			System.out.println(consump.distance+" is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Litres/100KM");
		System.out.printf("%.2f",consump.calculatingEuropean());
		System.out.println("\nMiles/gallons");
		System.out.printf("%.2f",consump.calculatingUS());
		sc.close();
	}

}
