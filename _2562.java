import java.util.Scanner;

public class _2562 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int input = 9;	// 입력으로 들어올 숫자는 9개로 고정
		int max = 0;	// 입력으로 100보다 작은 자연수만 오므로 초기값 0으로 설정
		int num = 0;	//	최대값이 몇 번째에 있는지 저장할 변수
		int[] arr = new int[input];	// 크기 9짜리 배열 선언
		
		
		for(int i=0; i < input; i++) {
			arr[i] = scan.nextInt();
			max = Math.max(max, arr[i]);	// 비교해서 더 큰 값을 max 변수에 저장!
		}
		
		for(int i=0; i < input; i++) {	// max와 일치하는 인덱스에 대해서만 작업 수행
			if(max == arr[i]) {
				num = i;
			}
		}
		
		System.out.println(max);
		System.out.println(num+1);	// num은 배열에서의 몇번째인지를 나타내므로 +1을 해주어야 한다.

	}

}
