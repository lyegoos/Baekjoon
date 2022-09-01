import java.util.Scanner;
import java.util.Arrays;

public class _10871{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();    // 수열안의 숫자 갯수
        int X = scan.nextInt();    // 주어진 정수 X
        int[] array = new int[N];    // 주어진 숫자 갯수만큼 배열할당
        
        for(int i=0; i<N; i++){    // for문으로 배열에 입력받는 숫자들을 넣는다.
            array[i] = scan.nextInt();
        }
        
        for(int j=0; j<N; j++){
            if(array[j]<X){
                System.out.print(array[j]+" ");
            }
        }
    }
}