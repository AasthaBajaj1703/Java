package findseason;

public class Output {
	public void display(int month) {
		if(month<1 || month>12) {
			System.out.println("Invalid month");
		}
		if(month>=3 && month<=5) {
			System.out.println("Season:Spring");
		}
		if(month>=6 && month<=8) {
			System.out.println("Season:Summer");
		}
		if(month>=9 && month<=11) {
			System.out.println("Season:Spring");
		}
		if(month<=2 || month == 12) {
			System.out.println("Season:Spring");
		}
		
	}
}
