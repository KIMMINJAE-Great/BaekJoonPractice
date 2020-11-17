import java.util.Scanner;

public class Drawstar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int x = 0; x < N; x++) {

			for (int y = x + 1; y < N; y++) {

				System.out.print(" ");

			}

			for (int z = N - x; z <= N; z++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}
}
