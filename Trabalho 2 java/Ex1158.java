import java.io.IOException;
import java.util.Scanner;

public class Ex1158 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        for(int i = 0; i < n; i++){
            s = new Scanner(System.in);
            int soma = 0;
            int contador = 0;
            boolean t = true;

            String linha = s.nextLine();
            String valores[] = linha.split("\\s");

            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);


            while(t){
                if(x %2 != 0){
                    soma += x;
                    contador++;
                }

                if(contador == y){
                    t = false;
                    continue;
                }
                x++;
            }//while
            System.out.println(soma);
        }//for

    }
}
