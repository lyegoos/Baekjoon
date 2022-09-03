import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int finish_min = B+C;
		
		if(A<0 || 24<=A || B<0 || B >= 60 || C<0 || C > 1000) {
			System.exit(0);
		}
		
		if( finish_min >= 60) {
			A = A + (finish_min/60);
			if( A >= 24 ) {
				A = A - 24;
			}
			B = finish_min%60;
		} else {
			B = finish_min;
		}
		
		System.out.println(A+" "+B);
	}

}
