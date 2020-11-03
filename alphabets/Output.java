package alphabets;

public class Output {
	public void display(int[] num) {
		for(int i=0;i<4;i++) {
			System.out.println(num[i]+"-"+(char)num[i]);
		}
	}
}
