import java.io.IOException;
import java.util.Scanner;

public class Ex1160 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int anos = 0;
        boolean x = true;

        for(int i = 0; i < t; i++){
            s = new Scanner(System.in);

            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int pa = Integer.parseInt(valores[0]);
            int pb = Integer.parseInt(valores[1]);
            double g1 = Double.parseDouble(valores[2]);
            double g2 = Double.parseDouble(valores[3]);

            while(x){
                double val1 = (pa*g1 / 100);
                double val2 = (pb*g2 / 100);

                pa += val1;
                pb += val2;

                if(pa <= pb){
                    anos++;
                }else{
                    x = false;
                    continue;
                }
            }//while
            anos++;

            if(anos > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println("" + anos + " anos.");
            }
            
            x = true;
            anos = 0;
        }//for
    }
}
