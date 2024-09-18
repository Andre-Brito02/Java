import java.io.IOException;
import java.util.Scanner;

public class Ex1099 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = 0;
        int y = 0;
        int maior = 0;
        int menor = 0;

        for(int i = 0; i < n; i++){
            s = new Scanner(System.in);
            
            int soma_impar = 0;

            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            x = Integer.parseInt(valores[0]);
            y = Integer.parseInt(valores[1]);

            if(x > y){
                maior = x;
                menor = y;
            }
            
            else if(x == y){
                maior = x;
                menor = y;
            }

            else{
                maior = y;
                menor = x;
            }

            while(menor < maior){
                if(menor == 3){
                    soma_impar = 0;
                }
                
                else if(menor %2 != 0){
                    soma_impar += menor;
                }

                else{
                    soma_impar += 0;
                }

                menor++;
            }//while

            System.out.println(soma_impar);
        }//for

    }
}
