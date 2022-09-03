import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2480 {	// 주사위 세개
/*	1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
	같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
	같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
	모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
	예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

	3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오. 
 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input = br.readLine().split(" ");	// 받은 입력을 공백을 구분자로 배열에 넣는다.
		int[] input_int = new int[input.length];
		
		
		for(int i=0; i<input.length; i++) {	// 입력받은 스트링값을 int로 형변환해 저장
			input_int[i] = Integer.parseInt(input[i]);
		}

		for(int k=0; k<input.length; k++) {	// 입력으로 들어온 주사위값이 범위를 벗어나면 종료
			if(input_int[k] < 1 || 6 < input_int[k]) {
				System.out.println("잘못 입력했습니다.");
				System.exit(0);
			}
		}
		
		int a = input_int[0];
		int b = input_int[1];
		int c = input_int[2];
		
		if(a==b && b==c) {	// 모든 수가 같은 케이스
			int no1 = 10000 + (a*1000);
			bw.write(no1+"");
		} else if (a==b || b==c) {	// 모든 수가 같지 않으면서 두 수가 같은데 b를 계산식에 쓰기위한 조건
			int no2 = 1000 + (b*100);
			bw.write(no2+"");
		} else if (a==c) {	// 같은 두 수에 b가 포함되지않고 a와 c만 같은 케이스
			int no2_1 = 1000 + (c*100);
			bw.write(no2_1+"");
		} else {	// 전부 다 같지 않은 케이스
			int max = moneyMax(input_int);
			int no3 = max * 100;
			bw.write(no3+"");
		}
		bw.flush();
		br.close();
		bw.close();
		
	}
	public static int moneyMax(int[] input_int) {
		int max_result = 0;	// 가장 큰 주사위 수
		
		for(int j=0; j<input_int.length; j++) {
			int max1 = Math.max(input_int[j], max_result);	// 모든 주사위의 수에서 가장 큰 수를 찾는다.
			max_result = max1;
		}
		return max_result;
	}

}