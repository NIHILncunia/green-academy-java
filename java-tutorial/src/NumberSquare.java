import java.util.Scanner;

public class NumberSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		
		System.out.print("출력할 줄 수 : ");
		number = scanner.nextInt();
		
		System.out.println();
		
		for (int row = 1, v = 1; row <= number; row++) {
			for (int col = 1; col <= number; col++) {
				System.out.printf("%2d  ", v++);
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
}
