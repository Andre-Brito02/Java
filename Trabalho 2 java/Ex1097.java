import java.io.IOException;

public class Ex1097 {
    public static void main(String[] args) throws IOException{
        int i = 1;
        int j = 7;
        int l = 1;
        int g = 1;
        boolean x = true;
        
        while(x){
            System.out.println("I=" + i + " J=" + j);
            //se g for menor que 3 
            if(g < 3){
                j--;//diminui o valor de j em 1
                g++;//aumenta o valor de g em 1
            //se g for maior q 3
            }else{
                //se i for igual a 9 e j igual a 13
                if(i == 9 && j == 13){
                    x = false;//muda a condição de x para false 
                }
                
                i += 2;//soma 2 ao valor de i
                j = 7 + (2*l);//multiplica 2 por l e soma 7 e atribui a j
                g = 1;//retorna o valor de g para 1
                l++;//aumenta o valor de l em 1
                
            }//else

        }//while
    }
}
