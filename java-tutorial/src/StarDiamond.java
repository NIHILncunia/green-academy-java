import java.util.Scanner;

public class StarDiamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 입력 (1이상의 홀수만) : ");
		
		do {
			number = scanner.nextInt();
			if (number % 2 == 1) break;
			System.out.print("다시 입력 : ");
		} while ((number % 2 == 0) || (number <= 0));
		
		int mid = (number + 1) / 2;
		int midup = mid + 1;
		int middown = mid - 1;
		int numberup = number + 1;
		
		System.out.println();

		for (int row = 1, start, end; row <= number; row++) {
			if (row <= mid) {
				start = midup - row;
				end = middown + row;
			} else {
				start = row - middown;
				end = (number + mid) - row;
			}
			
			for (int col = 1; col <= end; col++) {
				if (col < start) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for (int row = 1, start, end; row <= number; row++) {
			if (row <= mid) {
				start = row;
				end = numberup - row;
			} else {
				start = numberup - row;
				end = row;
			}
			
			for (int col = 1; col <= end; col++) {
				if (col < start) {
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
				if ((col > row && col < numberup - row) || (col > numberup - row && col < row)) {
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
