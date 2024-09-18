import java.io.IOException;
import java.util.Scanner;

public class Ex1149 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int n = s.nextInt();
        int soma = 0;
        boolean x = true;

        while(x){
            if(n <= 0){
                n = s.nextInt();
            }else{
                x = false;
                continue;
            }
        }//while
        int vetor[] = new int[n];

        for(int i = 0; i <= n-1; i++){
            vetor[i] = a + i;
            soma += vetor[i];
        }

        System.out.println(soma);
    }
}
