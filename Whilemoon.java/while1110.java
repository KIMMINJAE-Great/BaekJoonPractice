import java.util.Scanner;
public class while1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
        
		int X = 0;
		int Y = N;
        
		while (true) {
			N = ( ( N%10 )*10 ) + (( (N/10) + (N%10) )%10 );
			X++;
 
			if (Y == N) {
				break;
			}
		}
		System.out.println(X);
		
		
		
	}
}

