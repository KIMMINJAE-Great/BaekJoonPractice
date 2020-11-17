import java.util.Scanner;

public class AtLeastOverAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		int[] arr = new int[A];
		
		int sum = 0;
		int div = 0;
		for (int i = 0; i < arr.length; i++) {
			
			int B = sc.nextInt();
			
			for (int y = 0; y < B; y++) {
				int[] array = new int[B];
				array[y] = sc.nextInt();
				
				sum += array[y];
				div = sum/B;
				
				if(div<array[y]) {
					
				}
				
				}
				System.out.println();
			
			}
		
	}

}
