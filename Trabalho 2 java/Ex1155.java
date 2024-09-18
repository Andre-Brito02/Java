import java.io.IOException;

public class Ex1155 {
    public static void main(String[] args) throws IOException{
        double s = 0;

        for(double i = 1; i <= 100; i++){
            if(i == 1){
                s = 1;
            }else{
                s += (1 / i);
            }
        }//for

        System.out.printf("%.2f\n", s);
    }
}
