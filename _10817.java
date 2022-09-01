import java.util.Scanner;
import java.util.Arrays;

public class _10817{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int number = 3;    // 주어진 정수의 갯수
        int[] arr = new int[number];    // 정수 갯수만큼 배열 할당
        int n = 0;
        
        for(int i=0; i<arr.length; i++){    // 배열에 입력받은 정수들 삽입
        	n = scan.nextInt();
            if(1<=n && n<=100) {
            	arr[i] = n;            	
            }
            	
        }
        
        int min = 101;    // 최소값을 배열의 처음 값으로 초기화
        int temp = 0;
        for(int j=0; j<number-1; j++){
            for(int k=0; k<arr.length-1; k++){
                if(arr[k+1]<arr[k]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        
        System.out.println(arr[number-2]);
    }
}