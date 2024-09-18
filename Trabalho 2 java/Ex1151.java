import java.io.IOException;
import java.util.Scanner;

public class Ex1151 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int vetor[] = new int[n+1];

        for(int i = 0; i < n; i++){
            if(i < 2){
                vetor[i] = i;
            }else{
                vetor[i] = vetor[i-1] + vetor[i-2];
            }
        }//for

        for(int i = 0; i <= n-1; i++){
            if(i == n-1){
                System.out.printf("%d\n", vetor[i]);
            }else{
                System.out.printf("%d ", vetor[i]);
            }
        }

    }
}
