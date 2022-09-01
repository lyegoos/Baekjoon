import java.util.Scanner;

public class _2523{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        if(N<1 || N>100){
            System.out.println("잘못된 범위의 입력입니다.");
        }

        for(int i=0; i<N; i++){    // 줄수만큼 반복
            for(int j=0; j<=i; j++){    // 각 줄마다 반복횟수 지정
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int k=N; k<(2*N)-1; k++){
            for(int l=k; l<(2*N)-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}