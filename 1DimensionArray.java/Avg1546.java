import java.util.Arrays;
import java.util.Scanner;

public class Avg1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] S = new double[N];
		double[] X = new double[N];
		double a = 0;
		for (int i = 0; i < N; i++) {
			S[i] = sc.nextDouble();

		}
		Arrays.sort(S);

		for (int i = 0; i < N; i++) {
			X[i] = S[i] / S[N - 1] * 100;

		}

		for (int y = 0; y < N; y++) {

			a += X[y];
		}

		System.out.println(a / N);

	}
}
