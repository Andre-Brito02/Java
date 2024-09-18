import java.util.Scanner;
import java.io.IOException;

public class Ex1046 {
    public static void main(String[] args)throws IOException{
        Scanner s = new Scanner(System.in);  
    
        String linha = s.nextLine();
        String[] valores = linha.split("\\s");

        int horai = Integer.parseInt(valores[0]);
        int horaf = Integer.parseInt(valores[1]);

        if(horai >= 10 && horaf < 10){
            int qtd = horai - horaf;
            int hj = 24 - qtd;
            System.out.println("O JOGO DUROU " + hj + " HORA(S)");
        }
        
        else if(horai == horaf){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        else{
            int qtd = horaf - horai;
            System.out.println("O JOGO DUROU " + qtd + " HORA(S)");
        }
        
    }//static void
}
