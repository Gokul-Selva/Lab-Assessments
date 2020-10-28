/*
* Desc: To add salutation to names
* Author: Gokul S
*/
public class Salutationforname {

	public static void main(String[] args) {
		String[][] store = { { "Mr", "Pratik" }, { "Ms", "Aishwarya" }, { "Mrs", "Surya" }, { "Mr", "Dishant" },
				{ "Mr", "Somesh" }, { "Mr", "Praveen" } };
		for (int i = 0; i < store.length; i++) {
			for (int j = 0; j < store[0].length; j++) {
				System.out.print(store[i][j] + " ");
			}
			System.out.println();
		}
	}
}
