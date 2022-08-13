import java.util.Scanner;

public class StarDiamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 입력 (1이상의 홀수만) : ");
		
		// 짝수, 0이하 숫자 필터링.
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
			// 중간값에 해당하는 행을 기점으로 반전시켜 별을 찍음.
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
			// 모양은 다르지만 원리는 위와 같음.
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
					// 공백 범위
					System.out.print("  ");
				} else {
					// 나비 넥타이 범위
					System.out.print(" *");
				}
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
