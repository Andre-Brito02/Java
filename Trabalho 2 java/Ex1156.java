import java.io.IOException;

public class Ex1156 {
    public static void main(String[] args) throws IOException{
        double s = 0, i = 0;
        boolean x = true;
        int y = 0;
        while(x){
            if(y == 20){
                x = false;
                continue;
            }
            if(i == 0){
                s = 1;
            }else{
                s += ((2*i+1)/Math.pow(2, i));
            }
            i++;
            y++;
        }//while

        System.out.printf("%.2f\n", s);
    }
}
