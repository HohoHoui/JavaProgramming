package prac8;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("x1값을 입력하시오. >>");
		int x1 = scanner.nextInt();
		//System.out.print("y1값을 입력하시오. >>");
		int y1 = scanner.nextInt();
		
		//System.out.print("x2값을 입력하시오. >>");
		int x2 = scanner.nextInt();
		//System.out.print("y2값을 입력하시오. >>");
		int y2 = scanner.nextInt();
		scanner.close();
		if((100 <= x1 && x1 <= 200) && (100 <= y1 && y1 <= 200)) {
			//System.out.println("직사각형과 충돌한다.");
			System.out.println("True");
		}
		else if((100 <= x2 && x2 <= 200) && (100 <= y2 && y2 <= 200)) {
			//System.out.println("직사각형과 충돌한다.");
			System.out.println("True");
		}
		else {
			//System.out.println("직사각형과 충돌하지 않는다.");
			System.out.println("False");
		}
	}
}
