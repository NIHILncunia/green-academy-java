import java.util.Scanner;

public class StarDiamondOutline {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		final int number = 5, mid;
		mid = (number + 1) / 2;
		
		for (int row = 1, start, end; row <= number; row++) {
			if (row <= mid) {
				start = mid + 1 - row;
				end = mid - 1 + row;
			} else {
				start = row - (mid - 1);
				end = number + mid - row;
			}
			
			for (int col = 1; col <= end; col++) {
				if (col < start || (col > start && col < end)) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			
			System.out.println();
		}
	}
}
