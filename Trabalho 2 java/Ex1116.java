import java.io.IOException;
import java.util.Scanner;

public class Ex1116 {
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            s = new Scanner(System.in);

            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int x = Integer.parseInt(valores[0]);
            int y = Integer.parseInt(valores[1]);

            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", (double)x/(double)y);
            }
        }
    }    
}
