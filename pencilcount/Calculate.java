package pencilcount;

public class Calculate {
	int sum = 0;
	public int findPencils(int standard) {
		if(standard<1 || standard>12) {
			System.out.println("Invalid Standard");
			System.exit(0);
		}
		for(int i=1;i<=standard;i++) {
			sum = sum + (i*i);
		}
		return sum;
	}

}
