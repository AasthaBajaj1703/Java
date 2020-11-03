package highestplacement;

public class Calculate {
	public void findHighest(int cse, int ece, int mech) {
		if((cse < 0)||(ece < 0)||(mech < 0)) {
			System.out.println("Input is Invalid");
			System.exit(0);
		}
		if(cse == ece){
			if(ece == mech) {
				System.out.println("None of the department has got the highest placement");
				System.exit(0);
			}
		}
		if(cse > ece) {
			System.out.println("Highest placement");
			if(cse > mech) {
				if(cse == mech) {
					System.out.println("CSE");
					System.out.println("MECH");
				}
				else {
					System.out.println("CSE");
				}
			}
			else {
				System.out.println("MECH");
			}
		}
		else if(ece > mech) {
			System.out.println("Highest placement");
			if(cse == ece) {
				System.out.println("CSE");
				System.out.println("ECE");
			}
			else {
				
				System.out.println("ECE");
			}
		}
		else {
			System.out.println("Highest placement");
			if(ece == mech) {
				System.out.println("ECE");
				System.out.println("MECH");
			}
			else {
				System.out.println("MECH");
			}
		}
	}

}
