class TV {
	String model;
	int year;
	int intch;
	public TV(String x, int y, int z) {
		this.model = x;
		this.year = y;
		this.intch = z;
	}
	
	void show() {
		System.out.println(this.model + "에서 만든 " + this.year + "년형 " + this.intch + "인치 TV");
	}
	
}

public class Main {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}

