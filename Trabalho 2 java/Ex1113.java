import java.io.IOException;
import java.util.Scanner;

public class Ex1113 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        boolean x = true;

        while(x){
            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int a = Integer.parseInt(valores[0]);
            int b = Integer.parseInt(valores[1]);

            if(a == b){
                x = false;
                continue;
            }else{
                if(a > b){
                    System.out.println("Decrescente");
                }else{
                    System.out.println("Crescente");
                }
            }
        }
    }
}
