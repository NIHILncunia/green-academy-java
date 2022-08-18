import java.util.Scanner;

public class StarXPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 입력 : ");
		number = scanner.nextInt();

		System.out.println();

		for (int row = 1, start, end; row <= number; row++) {
			if (row <= 3) {
				start = row;
				end = number + 1 - row;
			} else {
				start = number + 1 - row;
				end = row;
			}
			for (int col = 1; col <= end; col++) {
				if ((col > start && col < end) || (col < start && col < end)) {
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
