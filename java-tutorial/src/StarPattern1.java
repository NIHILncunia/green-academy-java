import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 : ");
		number = scanner.nextInt();
		
		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number * 2 - 1; col++) {
				if (col > row && col < number * 2 - row) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}

			System.out.println();
		}

		System.out.println();

		for (int row = 1; row <= number; row++) {
			for (int col = 1; col <= number * 2 - 1; col++) {
				if (col > number + 1 - row && col < number - 1 + row) {
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
