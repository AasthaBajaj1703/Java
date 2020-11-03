package billgeneration;

public class Generation {
	public int generateBill(int pizza,int puff,int drink) {
		int bill = (pizza*100)+(puff*20)+(drink*10);
		return bill;
	}
}


