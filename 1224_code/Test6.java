public class Test6 {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4};
		int[] y = x;

		System.out.println("1. x Reference: " + x);
		System.out.println("2. y Reference: " + y);

		x = new int[2];
		System.out.println("3. x Reference(new): " + x);
		System.out.println("4. y Reference: " + y);

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: " + x[i] + " ");
		}
		System.out.println();
	}
}