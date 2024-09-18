import java.io.IOException;
import java.util.Scanner;

public class Ex1154 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);

        boolean x = true;
        int soma = 0, contador = 0;
        
        while(x){
            int idades = s.nextInt();
            if(idades < 0){
                x = false;
                continue;
            }else{
                soma += idades;
                contador++;
            }
        }//while

        System.out.printf("%.2f\n", (double)soma/(double)contador);
    }
}
