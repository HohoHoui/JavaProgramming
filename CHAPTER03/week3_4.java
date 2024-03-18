public class Main {
	public static void main(String[] args) {
		for(int i = 1 ; i < 100 ; i++) {
			if(i / 10 != 0) {
				if((i / 10) % 3 == 0) {
					System.out.print(i + " jjak");
					if((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)){
						System.out.println("jjak");
					}
					else {
						System.out.println();
					}
				}
				else if((i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
					System.out.println(i + " jjak");
				}
			}
			else if((i % 3) == 0) {
				System.out.println(i + " jjak");
			}
		}

	}

}
