import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("정수를 입력하시오>>");
		int num;
		while(true) {
			num = scanner.nextInt();
			if(1 <=num && num <= 18) {
				break;
			}
			else {
				System.out.println("-1");
			}
		}
		scanner.close();
		
		for(int i = 0 ; i < num ; i ++) {
			for(int j = num - i ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	} 
}
