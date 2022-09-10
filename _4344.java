import java.util.Scanner;

public class _4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String Input = scan.nextLine();
		int C = Integer.parseInt(Input);
		int N;
		int sum = 0;
		int avg = 0;
		int count = 0;
		double[] result = new double[C];
		int arr[];
	
		
		for(int i=0; i < C; i++) {	// 각 입력받을 케이스 for문
			N = scan.nextInt();
			sum = 0;
			avg = 0;	
			count = 0;	// 매 줄의 연산 후 다음 줄 작업하기 전 초기화해줌
			arr = new int[N];
			
			for(int j=0; j < N; j++) {	// 입력값들 배열 초기화
				arr[j] = scan.nextInt();
			}
			
			for(int k=0; k < arr.length; k++ ) {	// sum, avg를 구하기 위해 순회
				sum += arr[k];
			}
			avg = sum / N;
			
			for(int l=0; l < arr.length; l++) {
				if(avg < arr[l]) {
					count++;
				}
			}
			
			result[i] = (count / (double)N) * 100.0;
		}
		
		for(int i=0; i < C; i++) {
			double result2 = Math.round(result[i]*1000) / 1000.0;
			System.out.printf("%.3f%%\n", result2);		// 형식 지정자를 사용하는 printf문에서 %를 출력하고 싶다면 %%를 사용하면 된다!
		}
		
		

	}

}
