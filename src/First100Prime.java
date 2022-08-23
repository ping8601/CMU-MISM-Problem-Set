public class First100Prime {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i < 1000; i++ ) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime & count < 100){
				System.out.println(i);
				count += 1;
			}
		}
	}
}
