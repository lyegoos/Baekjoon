import java.util.Scanner;

public class _18108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String bulYear = scan.nextLine();
		
		int bulYearInt = Integer.parseInt(bulYear);
		
		if(1000 <= bulYearInt && bulYearInt <= 3000) {
			int seoYear = bulYearInt- 543;
			System.out.println(seoYear);
		} else {
			System.exit(0);
		}
	}
}