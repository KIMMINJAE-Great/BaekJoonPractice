import java.util.Scanner;

public class while10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A + B;
			if (C != 0) {
				System.out.println(C);
			} else {

				run = false;
			}

		}
		sc.close();
	}

}
