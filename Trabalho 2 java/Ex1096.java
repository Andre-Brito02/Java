import java.io.IOException;

public class Ex1096 {
    public static void main(String[] args) throws IOException{
        int i = 1;
        int j = 7;
        int x = 0;

        while(x < 15){
            System.out.println("I=" + i + " J=" + j);
            
            if(j == 5){
                i += 2;
                j = 7;
            }else{
                j--;
            }
            x++;
        }
    }
}
