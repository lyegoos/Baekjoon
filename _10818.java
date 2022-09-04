import java.util.Scanner;

public class _10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int min = 1000000;
		int max = -1000000;
		int[] array = new int[N];
		
		
		for(int i=0; i<N; i++) {
			int input = scan.nextInt();
			array[i] = input;
		}
		
		for(int i=0; i<N; i++) {
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
		}

		System.out.printf("%d %d", min, max);
	}

}
