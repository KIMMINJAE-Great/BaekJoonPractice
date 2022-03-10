import java.util.Scanner;

public class OxQuiz8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] A = new String[sc.nextInt()];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextLine();
		}

		sc.close();

		for (int i = 0; i < A.length; i++) {

			int cnt = 0; 
			int sum = 0; 

			for (int j = 0; j < A[i].length(); j++) {

				if (A[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}

			System.out.println(sum);
		}
	}
}
