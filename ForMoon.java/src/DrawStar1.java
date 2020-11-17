import java.util.Scanner;

public class DrawStar1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int x = 1; x <= N; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
