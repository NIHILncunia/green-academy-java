import java.util.Scanner;

public class DiamondSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 입력 : ");
		number = scanner.nextInt();
		
		int mid = (number + 1) / 2;
		int midup = mid + 1, middown = mid - 1;
		
		System.out.println();

		for (int row = 1, start, end; row <= number; row++) {
			if (row <= mid) {
				start = midup - row;
				end = middown + row;
			} else {
				start = row - middown;
				end = number + mid - row;
			}
			for (int col = 1; col <= number; col++) {
				if (col > start && col < end) {
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
