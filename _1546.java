import java.util.Scanner;

public class _1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int subject = scan.nextInt();	// 과목수를 입력받음
		double[] score = new double[subject];
		double max = 0;
		double total = 0;
		double avg;
		
		for(int i=0; i < subject; i++) {	// 점수입력받아 배열 초기화
			score[i] = scan.nextDouble();
		}
		
		for(int i=0; i < subject; i++) {	// 배열에서 최대값을 찾음
			max = Math.max(score[i], max);
		}
		
		for(int i=0; i < subject; i++) {	// 순회하면서 모든 점수를 조작한다
			score[i] = (score[i] / max) * 100;
		}
		
		for(int i=0; i < subject; i++) {	// 조작한 점수의 평균을 구한다
			total += score[i];
		}
		
		avg = total / subject;
		System.out.println(avg);
		
	}

}
