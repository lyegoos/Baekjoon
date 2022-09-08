import java.util.Scanner;

public class _8598 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inputNum = scan.nextInt();	// 입력받을 케이스의 수
		String XO;	// 입력받는 XO 문자열
		int score = 0;
		int sum = 0;
		int[] sums = new int[inputNum];
		
		for(int j=0; j < inputNum; j++) {
			XO = scan.next();
			for(int i=0; i < XO.length(); i++) {
				
				String c = XO.charAt(i) + "";	// 입력받은 문자열에서 한글자씩 떼서 검사한다.
				score = (c.equals("X")) ? 0 : ++score;	// score++ 로 한다면 for문이 끝난 다음에 score가 바뀌는거라서 전위연산자로 해준다.
				sum += score;	
			}
			sums[j] = sum;	// 입력받은 한 줄에 대한 결과인 sum을 나중에 한 번에 결과를 출력하기 위해 배열로 저장한다
			score = 0;	// 여기서 score와 sum 값을 다시 0으로 초기화해주지 않으면 다음 문장에 대한 처리를 할 때 값이 남아있어서 잘못된 결과가 나온다.
			sum = 0;
		}
		for(int i=0; i < sums.length; i++) {
			System.out.println(sums[i]);
		}
	}

}
