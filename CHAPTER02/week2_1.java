import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		
		int fiftyThousand = (money / 50000);
		int tenThousand = (money % 50000) / 10000;
		int Thousand = (money % 50000 %10000) / 1000;
		int fiveHundred = (money % 50000 % 10000 %1000) / 500;
		int Hundred = (money % 50000 % 10000 % 1000 % 500) /100;
		int fifty = (money % 50000 % 10000 % 1000 % 500 % 100) / 50;
		int ten = (money % 50000 % 10000 % 1000 % 500 % 100 % 50) / 10;
		int one = (money % 50000 % 10000 % 1000 % 500 % 100 % 50 % 10);
		
		if(fiftyThousand > 1) {
			System.out.println(fiftyThousand + " 50,000won bill(s)");
		}
		else if(fiftyThousand == 1) {
			System.out.println(fiftyThousand + " 50,000won bill");
		}
		
		if(tenThousand > 1) {
			System.out.println(tenThousand + " 10,000won bill(s)");
		}
		else if(tenThousand == 1) {
			System.out.println(tenThousand + " 10,000won bill");
		}
		
		if(Thousand > 1) {
			System.out.println(Thousand + " 1,000won bill(s)");
		}
		else if(Thousand == 1) {
			System.out.println(Thousand + " 1,000won bill");
		}
		
		if(fiveHundred > 1) {
			System.out.println(fiveHundred + " 500won coin(s)");
		}
		else if(fiveHundred == 1) {
			System.out.println(fiveHundred + " 500won coin");
		}
		
		if(Hundred > 1) {
			System.out.println(Hundred + " 100won coin(s)");
		}
		else if(Hundred == 1) {
			System.out.println(Hundred + " 100won coin");
		}
		
		if(fifty > 1) {
			System.out.println(fifty + " 50won coin(s)");
		}
		else if(fifty == 1) {
			System.out.println(fifty + " 50won coin");
		}
		
		if(ten > 1) {
			System.out.println(ten + " 10won coin(s)");
		}
		else if(ten == 1) {
			System.out.println(ten + " 10won coin");
		}
		
		if(one > 1) {
			System.out.println(one + " 1won coin(s)");
		}
		else if(one == 1) {
			System.out.println(one + " 1won coin");
		}
		
		scanner.close();
	}
}
