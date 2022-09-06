import java.util.Scanner;

public class _3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int input = 10;
		int div = 42;
		int[] arr1 = new int[div];	// 입력값을 넣을 배열
		int[] arr2 = new int[div];	// 나눈 나머지값을 넣을 배열
		
		for(int i=0; i < input; i++) {	// 입력값으로 arr1 배열 초기화
			arr1[i] = scan.nextInt();
		}
		
		for(int i=0; i < div; i++) {	// arr2 초기화
			arr2[i] = 0;
			
		}
		
		for(int i=0; i < input; i++) {	
			arr2[arr1[i]%42] += 1;
		}
		
		for(int i=0; i < div; i++) {	// 42로 나눈 나머지들을 배열로 저장
			if(arr2[i]>=1) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	

}
