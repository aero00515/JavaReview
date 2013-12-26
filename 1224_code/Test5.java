class Test5 {
	public static void main(String[] args) {
		int[] list1 = {1,2,3};
		int[] list2 = {1,2,3};

		System.out.println("List1 Reference: " + list1);
		System.out.println("List2 Reference: " + list2);
		
		list2 = list1;
		System.out.println("List2 Reference (New): " + list2);

		list1[0] = 0;
		list1[1] = 1;
		list1[2] = 2;

		for (int i = 0; i < list2.length; i++) {
			System.out.print(list2[i] + " ");
		}
		System.out.println();
	}
}