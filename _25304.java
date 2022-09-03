import java.util.Scanner;

public class _25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int kind_num = scan.nextInt();
		if(total < 1 || 1_000_000_000 < total || kind_num < 1 || 100 < kind_num) {	// 입력값 X,N 검증
			System.out.println("잘못된 입력입니다");
		}
		int[][] goods = new int[kind_num][2];
		
		int sum = 0;
		
		for(int i=0; i<kind_num; i++) {
			goods[i][0] = scan.nextInt();
			if(goods[i][0] < 1 || 1000000< goods[i][0])
				System.out.println("잘못된 입력입니다.");
			goods[i][1] = scan.nextInt();
			if(goods[i][1] < 1 || 10 < goods[i][1])
				System.out.println("잘못된 입력입니다.");
		}
		
		for(int i=0; i<kind_num; i++) {
			sum += goods[i][0] * goods[i][1];
		}
		
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
