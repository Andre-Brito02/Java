import java.io.IOException;
import java.util.Scanner;

public class Ex1080 {
    public static void main(String args[])throws IOException{
        Scanner s = new Scanner(System.in);
        
        int nums[] = new int[100];
        int maior_num = 0;
        int posicao = 0;

        for(int i = 0; i < nums.length; i++){
            nums[i] = s.nextInt();

            if(nums[i] > maior_num){
                maior_num = nums[i];
                posicao = i;
            }
        }

        System.out.println(maior_num);
        System.out.println(posicao);
    }    
}
