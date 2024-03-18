import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s;
		char c;

		while(true) {
			s = scanner.next();
			c = s.charAt(0);
			if(c <= 97 || 123 <= c) {
				System.out.println("-1");
			}
			else
				break;
		}
		int i = 0;
		for(int a = 97 ; a <= c ; a++) {
			for(int b = 97 ; b <= c - i; b++) {
				System.out.print((char)b);
			}
			i++;
			System.out.println();
		}
		scanner.close();

	}

}
