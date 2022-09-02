import java.util.Scanner;

public class _2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int cooking = scan.nextInt();
		
		int finish_min = min+cooking;
		
		if( finish_min > 60) {
			hour = hour +1;
			min = finish_min - 60;
		} else {
			min = finish_min;
		}
		
		System.out.println(hour+" "+min);
	}

}
