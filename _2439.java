import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class _2439{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<N; i++){
            for(int k=0; k<(N-1-i); k++){	// k의 반복횟수도 점점 줄어야하므로 i값을 사용해서 조절
                bw.write(" ");
            }
            for(int j=0; j<(i+1); j++){
                bw.write("*");    
            }
            bw.write("\n");
        }
        bf.close();
        bw.flush();
        bw.close();
    }
}