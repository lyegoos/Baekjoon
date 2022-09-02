import java.util.Scanner;

public class _3003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 0 1 2 2 2 7 - 킹 퀸 룩 비숍 나이트 폰 - 1 1 2 2 2 8
		
		final int kind = 6;
		
		int[] arr = new int[kind];
		int[] answer = {1,1,2,2,2,8};
		int[] chess = new int[kind];
		
		for(int i=0; i < kind ; i++) {
			int input = scan.nextInt();
			if(input < 0 || input > 10) {
				System.exit(0);
			} else {
				arr[i] = input;
			}
		}
		for(int j=0; j < kind; j++) {
			chess[j] = answer[j]-arr[j];

			System.out.print(chess[j]+" ");
		}

		
	}
}
