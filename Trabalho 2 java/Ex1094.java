import java.io.IOException;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String args[])throws IOException{
        Scanner s = new Scanner(System.in);
        
        int quantia = s.nextInt();
        int qtd_rato = 0;
        int qtd_sapo = 0;
        int qtd_coelho = 0;
        int cobaia = 0;
        double percentagem_r = 0;
        double percentagem_s = 0;
        double percentagem_c = 0;
        char pct = 37;

        for(int i = 0; i < quantia; i++){
            s = new Scanner(System.in);

            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int qtd_animal = Integer.parseInt(valores[0]);
            String animal = valores[1];

            if(animal.equals("c") || animal.equals("C")){
                qtd_coelho += qtd_animal;
            }

            else if(animal.equals("r") || animal.equals("R")){
                qtd_rato += qtd_animal;
            }

            else if(animal.equals("s") || animal.equals("S")){
                qtd_sapo += qtd_animal;
            }

            cobaia += qtd_animal;
        }//for

        percentagem_c = (100 * qtd_coelho) / (double)cobaia;
        percentagem_r = (100 * qtd_rato) / (double)cobaia;
        percentagem_s = (100 * qtd_sapo) / (double)cobaia;

        System.out.println("Total: " + cobaia + " cobaias");
        System.out.println("Total de coelhos: " + qtd_coelho);
        System.out.println("Total de ratos: " + qtd_rato);
        System.out.println("Total de sapos: " + qtd_sapo);
        System.out.printf("Percentual de coelhos: %.2f %c\n", percentagem_c, pct);
        System.out.printf("Percentual de ratos: %.2f %c\n", percentagem_r, pct);
        System.out.printf("Percentual de sapos: %.2f %c\n", percentagem_s, pct);
    }
}
