import java.util.Scanner;

public class _10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		
		do {
			 a = scan.nextInt();
			 b = scan.nextInt();
			 if(a == 0 || b == 0) {
				 break;
			 }
			 if( 10 < a || 10 < b ) {
				 break;
			 }
			 System.out.println(a+b);
			
		} while(true);

	}

}