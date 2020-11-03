
package billgeneration;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pizza;
		int puff;
		int drink;
		int bill;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought:");
		pizza = sc.nextInt();
		System.out.print("Enter the no of puffs bought:");
		puff = sc.nextInt();
		System.out.print("Enter the no of cool drinks bought:");
		drink = sc.nextInt();
		Generation generation = new Generation();
		bill = generation.generateBill(pizza,puff,drink);
		System.out.println("\nBill Details");
		System.out.println("No of pizzas:"+pizza);
		System.out.println("No of puffs:"+puff);
		System.out.println("No of cooldrinks:"+drink);
		System.out.println("Total price ="+bill);
		System.out.println("ENJOY THE SHOW!!!");
		sc.close();
	}

}
