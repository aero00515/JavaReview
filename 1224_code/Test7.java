public class Test7 {
	public static void main(String[] args) {
		int[] a = new int[4];
		System.out.println("1. a Reference: " + a);
		a[1] = 4;
		a = new int[2];
		System.out.println("2. a Reference(new): " + a);
		System.out.println("a[1] is " + a[1]);
		System.out.println();
	}
}