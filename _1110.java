import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1110 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		int a = input / 10;; // a는 두자리 정수에서 첫째자리 수
		int b = input % 10; // b는 두번째자리 수
		int sumAndLast = 0;	// 두 자릿수를 합한다음 두번째자리수를 뽑아내는 변수
		int c = -1; // 연산을 수행한 뒤의 숫자( 입력으로 0이 올 수 있기 때문에 입력과 아예 다른 값을 주어야한다.)
		int count = 0;
		
		if( input < 0 || 100 <= input) {
			System.out.println("잘못된 입력");
			System.exit(0);
		}
		
		while( input != c ) {
			if(count != 0 ) {
				a = c / 10;
				b = c % 10;
			}
			sumAndLast = (a + b) % 10;
			String s = Integer.toString(b) + Integer.toString(sumAndLast);
			c = Integer.parseInt(s);
			count++;
		}
		bw.write(count+"");
        br.close();
        bw.flush();
        bw.close();
	}

}

