package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {

		// // 1. Display all numbers from 0 to 100
		// for (int i = 0; i < 101; i++) {
		// System.out.println(i);
		// }
		//
		// // 2. Display all numbers from 100 to 0
		// for (int x = 100; x > 0; x--) {
		// System.out.println(x);
		// }
		//
		// // 3. Display all even numbers from 2 to 100
		// for (int e = 2; e < 101; e++) {
		// if (e % 2 == 0) {
		// System.out.println(e);
		// }
		// }
		//
		// // 4. Display all odd numbers from 1 to 99
		// for (int v = 1; v < 100; v++) {
		// if (v % 2 == 1) {
		// System.out.println(v);
		// }
		// }
		// // 5. Display all numbes from 1 to 500. If the number is odd, print "odd"
		//
		// // to the number. If the number is even, print "even" next to the number.
		// for (int r = 1; r < 500; r++) {
		// if (r % 2 == 0) {
		// System.out.println(r + " is even.");
		// }
		// if (r % 2 == 1) {
		// System.out.println(r + " is odd");
		// }
		// }
		//
		// // 6. Display all multiples of 7 from 0 to 777
		// for (int c = 1; c < 778; c++) {
		// if (c % 7 == 0) {
		// System.out.println(c);
		// }
		// }
		// // 7. Print all the years you were alive and how old you
		// for (int h = 2008; h < 2020; h++) {
		// System.out.println("In " + h + ", I was " + (h - 2008) + " years old");
		// }
		//
		// // NESTLED FOR-LOOPS
		//
		// // 1. Display this output...
		//
		// for (int j = 0; j < 3; j++) {
		// for (int i = 0; i < 3; i++) {
		// }
		//
		// }
		// // 2. Display the numbers 1 through 9 in a 3x3 square grid like this :
		// for (int j = 0; j < 7; j += 3) {
		// for (int i = 1; i < 4; i++) {
		// System.out.print(i + j);
		// }
		// System.out.println();
		// }
		// // 3. Display the numbers 1 through 100 in a 10x10 square grid
		// for (int i = 0; i < 100; i += 10) {
		// for (int j = 1; j < 11; j++) {
		// System.out.print(i + j + " ");
		// }
		// System.out.println();
		// }
		// 4. Display the following output :
		for (int i = 1; i < 7; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}

}
