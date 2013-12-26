/**
 * 1224 test
 * Question 3
 */
public class Test3 {
	public static void main(String[] args) {
		int[] oldList = {1,2,3,4,5};
		// System.out.println("1. Old List Reference(Before reverse): " + oldList);
		reverse(oldList);
		// System.out.println("5. Old List Reference(After reverse): " + oldList);
		for (int i = 0; i < oldList.length; i++) {
			System.out.print("O[" + i + "]: " + oldList[i] + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] list) {
		// System.out.println("2. List Reference: " + list);
		int[] newList = new int[list.length];
		// System.out.println("3. New List Reference: " + newList);
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[list.length - 1 - i];
			System.out.print("N[" + i + "]: " + newList[i] + " ");
		}

		list = newList;
		System.out.println();
		// System.out.println("4. List Reference: " + list);
	}
}