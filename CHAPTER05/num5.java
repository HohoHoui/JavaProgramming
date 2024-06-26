import java.util.Scanner;

abstract class Calc{
	public int a, b;
	
	public abstract void setValue(int a, int b);
	public abstract int calculate();
}

class Add extends Calc{
	public void setValue(int a, int b){ //public 왜 안 쓰면 에러라는 거는 abstract class에서 public으로 선언헤서 그런 것 같음.
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return this.a + this.b;
	}
}

class Sub extends Calc{
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return this.a - this.b;
	}
}

class Mul extends Calc{
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return this.a * this.b;
	}
}

class Div extends Calc{
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return this.a / this.b;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operator = scanner.next();
		
		switch(operator) {
		case "+": 
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case "-": 
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div = new Div();
			if(b == 0) {
				System.out.println("계산할 수 없습니다.");
				break;
			}
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		//default: System.out.println("enter one of te following (+. -, *, /)");
		default: System.out.println("잘못된 연산자입니다.");
			scanner.close();
		}
	}

}
