import java.util.Scanner;


class Add{
	int num1;
	int num2;
	
	void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public int calculate() {
		return num1 + num2;
	}
		
}

class Sub{
	int num1;
	int num2;
	
	void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public int calculate() {
		return num1 - num2;
	}
		
}

class Mul{
	int num1;
	int num2;
	
	void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public int calculate() {
		return num1 * num2;
	}
		
}

class Div{
	int num1;
	int num2;
	
	void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public int calculate() {
		if(this.num2 == 0) {
			return 0;
		}
		else {
			return num1 / num2;			
		}
	}
		
}


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		char operator;
		
		//System.out.print("정수와 연산자를 입력하시오 >> ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		operator = scanner.next().charAt(0);
		scanner.close();
		switch(operator) {
			case '+':
				Add a = new Add();
				a.setValue(num1, num2);
				System.out.println(a.calculate());
				break;
			case '-':
				Sub s = new Sub();
				s.setValue(num1, num2);
				System.out.println(s.calculate());
				break;
			case '*':
				Mul m = new Mul();
				m.setValue(num1, num2);
				System.out.println(m.calculate());
				break;
			case '/':
				Div d = new Div();
				d.setValue(num1, num2);
				if (d.calculate() == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
					System.out.println(d.calculate());					
				}
				break;
			default : System.out.println("해당하는 연산이 없습니다.");
		}
	}

}
