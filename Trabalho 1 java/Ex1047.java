import java.io.IOException;
import java.util.Scanner;

public class Ex1047 {
    public static void main (String[] args) throws IOException{
        Scanner s = new Scanner (System.in);

        System.out.printf("Digite em qual horario voce iniciou o jogo \n");

        System.out.printf("Digite primeiro a hora que comecou \n");
        int hi = s.nextInt();

        System.out.printf("Digite agora os minutos do horario em que comecou\n");
        int mi = s.nextInt();

        System.out.printf("Certo, agora qual foi o horario que parou de jogar?\n");
        int hi2 = s.nextInt();

        System.out.printf("Por fim, os minutos do horario na qual parou de jogar \n");
        int mi2 = s.nextInt();

        int horai = hi - hi2;
        int hj = 24 - horai;
        int min = mi2 - mi;
        int mj = 60 - min;

        if (hi >= 10 && hi2 < 10){
            int horai2 = hi - hi2;
            int hj2 = 24 - horai;
            int min3 = mi2 - mi;
            int mj2 = 60 - min;
            System.out.printf("Voce jogou por " + hj2 + " Hora(s) e " + mj2 + " Minuto(s)");}

            else if ((hi < 10) && (mi > 10)){
            int horaf2 = hi2 - hi;
            int mj3 = mi2 - min;
            System.out.printf("Voce jogou por " + horaf2 +" Hora(s) e " + mj3 + " Minuto(s)");}

            else if (((hi < 10) && (mi < 10) && ((hi != hi2) || (mi != mi2)))){
            int horaf3 = hi2 - hi;
            int mj4 = mi - mi2;
            int mj5 = mj4 * (-1);
            System.out.printf("Voce jogou por " + horaf3 +" Hora(s) e " + mj5 + " Minuto(s)");}

            else if ((hi == hi2) && (mi == mi2)){
            System.out.printf("O jogo Durou 24 Hora(s) e 0 Minuto(s)");}
    
            else if ((min < 0) && (hi < hi2)){
            int horaf = hi2 - hi;
            int c = horaf + min;
            int min2 = min + 60;
            System.out.printf("Voce jogou por " + c + " Hora(s) e " + min2 + " Minuto(s)" );}

            else if ((min < 0) && (hi >= hi2)){
            int horaf4 = hi - hi2;
            int h24 = 23 - horaf4;
            int c2 = hi2 + min;
            int min3 = min + 60;
            System.out.printf("Voce jogou por " + h24 + " Hora(s) e " + min3 + " Minuto(s)");}
            

    }
}
