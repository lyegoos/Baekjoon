import java.util.Scanner;

public class _2446{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        if(N<1 || N>100){
            System.out.println("잘못된 범위의 입력입니다.");
        }

        for(int i=0; i<N; i++){    // 줄수만큼 반복
            for(int j=0; j<i; j++){   // 줄수에 따라 공백 찍기 
                System.out.print(" ");
            }
            for(int k=0; k<(2*N)-1-(2*i); k++){
                System.out.print("*");
            }
//            for(int l=0; l<i; l++){   // 줄수에 따라 공백 찍기 
//                System.out.print(" ");
//            }
            System.out.println();
        }
        for(int m=N; m>1; m--){    // N-1만큼의 줄이 남아있음
            for(int o=m-1; o>1; o--){   // 줄수에 따라 공백 찍기 / 4 1 4 / 3 3 3 / 2 5 2 / 1 7 1 / 0 9 0 
                System.out.print(" ");
            }
            for(int p=(2*N)+1; p>2*m-2; p--){
                System.out.print("*");
            }
//            for(int q=m-1; q>1; q--){   // 줄수에 따라 공백 찍기 
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}