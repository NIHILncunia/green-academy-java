import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.print("출력할 줄 수 : ");
		number = scanner.nextInt();

		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(" *");
			}

			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number + 1 - row; col++) {
				System.out.print(" *");
			}

			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number; col++) {
				if (col < number + 1 - row) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}

			System.out.println();
		}
		
		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number; col++) {
				if (row > col) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}

			System.out.println();
		}

		scanner.close();
	}

}
