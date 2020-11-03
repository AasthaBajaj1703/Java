package luckynumber;

public class Output {
	int rem;
	int sum = 0;
	int quotient;
	
	public void findLucky(int number) {
		if(number<1000 || number>9999) {
			System.out.println(number+" is not a valid car number");
			System.exit(0);
		}
		while(number>0) {
			rem = number%10;
			sum = sum + rem;
			number = number/10;
		}
	if(((sum%3)==0)||((sum%5)==0)||((sum%7)==0)) {
		System.out.println("Lucky Number");
	}
	else {
		System.out.println("Sorry its not my lucky number");
	}
}
}
