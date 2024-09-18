import java.io.IOException;
import java.util.Scanner;

public class Ex1101 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        boolean x = true;

        while(x){
            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int a = Integer.parseInt(valores[0]);
            int b = Integer.parseInt(valores[1]);
            int soma = 0;

            if(a <= 0 || b <= 0){
                x = false;
                continue;
            }

            if(a > b){
                maior = a;
                menor = b;
            }else{
                maior = b;
                menor = a;
            }

            for(;menor <= maior; menor++){
                System.out.print("" + menor + " ");
                soma += menor;
            }

            System.out.println("Sum=" + soma);
        }//while
        
    }
}
