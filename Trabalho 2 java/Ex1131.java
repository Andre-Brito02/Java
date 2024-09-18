import java.io.IOException;
import java.util.Scanner;

public class Ex1131 {
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        boolean x = true;
        int grenais_totais = 1;
        int vit_inter = 0;
        int vit_gremio = 0;
        int empate = 0;

        while(x){
            s = new Scanner(System.in);

            String linha = s.nextLine();
            String[] valores = linha.split("\\s");

            int gols_inter = Integer.parseInt(valores[0]);
            int gols_gremio = Integer.parseInt(valores[1]);

            if(gols_inter == gols_gremio){
                empate++;
            }

            else if(gols_inter > gols_gremio){
                vit_inter++;
            }

            else{
                vit_gremio++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");

            int novo_grenal = s.nextInt();

            if(novo_grenal == 1){
                grenais_totais++;
                continue;
            }else{
                break;
            }
        }//while

        System.out.println("" + grenais_totais + " grenais");
        System.out.println("Inter:" + vit_inter);
        System.out.println("Gremio:" + vit_gremio);
        System.out.println("Empates:" + empate);

        if(vit_inter > vit_gremio){
            System.out.println("Inter venceu mais");
        }
        
        else if(vit_gremio > vit_inter){
            System.out.println("Gremio venceu mais");
        }

        else{
            System.out.println("Nao houve vencedor");
        }
    }
}
