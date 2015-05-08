package hello;

class Hello {
	public static void main(String[] args) {
		for (int i = 2; i < 8; i += 4) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 4; k++) {
					System.out.print(k + " X " + j + " = " + k * j);
					System.out.print("\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
