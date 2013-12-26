public class Test8 {
	public static void main(String[] args) {
		int list[] = {1, 2, 3, 4, 5, 6};

		System.out.println("First for-loop: ");
		for (int i = 1; i < list.length; i++) {
			list[i] = list[i - 1];
			System.out.print("list[" + i + " - 1]: " + list[i - 1] + " ");
		}
		System.out.println();
		System.out.println("Second for-loop: ");
		for (int i = 0; i < list.length; i++) {
			System.out.print("list[" + i + "]: " + list[i] + " ");
		}
		System.out.println();
	}
}