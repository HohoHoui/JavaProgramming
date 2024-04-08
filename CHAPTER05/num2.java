import java.util.Scanner;
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		//System.out.println(getSrcString() + "을 " + getDestString()+"로 바꿉니다.");
		//System.out.print(getSrcString() + "을 입력하시오 >>");
		double val = scanner.nextDouble();
		double res = convert(val);  
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
		scanner.close();
	}
}

class Won2Dollar extends Converter{
	
	protected String getSrcString(){
		return  "Km";
	}
	protected String getDestString(){
		return "Mile";
	}
	protected double convert(double money) {
		return (money / super.ratio);
	}
	public Won2Dollar(double a) {
		super.ratio = a;
	}
}
public class Main {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1.6);
		toDollar.run();
	}

}
