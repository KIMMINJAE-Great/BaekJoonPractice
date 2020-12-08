
import java.util.Scanner;

public class nameoji3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		int count = 0;
		int counts[] = new int[42];
		
		for(int i  = 0; i<counts.length; i++) {
			System.out.println(counts[i]);
		}
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();

		}
		sc.close();

		for(int i = 0; i<array.length; i++) {
			counts[array[i]%42]++;
			
		} 
		System.out.println(counts);
		for(int i = 0; i<counts.length; i++ ) {
			System.out.println(counts[i]);
			if(counts[i] != 0) {
				count++;
			}
		
		}
	System.out.println(count);
	}

}