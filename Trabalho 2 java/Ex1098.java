import java.io.IOException;

public class Ex1098 {
    public static void main(String[] args)throws IOException {
        double i = 0;//variavel para os valores de i
        double j[] = new double[3];//vetor para os valores de j
        int y = 0;//contador do laço while
        int num = -1;//variavel para poder acessar o vetor j dentro do while, começa em -1 para poder fazer a incrementação correta quando necessario
        int contador = 1;//variavel para alterar o valor de i e j quando contador for multiplo de 3

        //laço for para iniciar o vetor j com 1, 2, 3 nas posições 0,1 e 2 
        for(int x = 0; x < 3; x++){
            j[x] = x + 1;
        }
        //laço while para rodar uma quantidade de vezes
        while(y < 33){
            num++;//incrementa o valor inicial de -1 para poder ser acessado em j a partir do 0
            if(((j[num]) == 3) || ((j[num]) == 4) || ( (j[num]) == 5)){//verifica se o valor de j eh 3,4 ou 5 para exibir os valores de i e j como inteiros caso a condição seja verdadeira
                System.out.printf("I=%d J=%d\n", (int)Math.round(i), (int)j[num]);
            }

            else if(i < 1.0 && i > 0.0){ //verifica se i esta dentro do intervalo, se estiver exibe i e j com uma casa decimal
                System.out.printf("I=%.1f J=%.1f\n", i, j[num]);
            }
            
            else if(i < 2.0 && i > 1.0){ //verifica se i esta dentro do intervalo, se estiver exibe i e j com uma casa decimal
                System.out.printf("I=%.1f J=%.1f\n", i, j[num]);
            }

            else{//exibe os valores como inteiros
                System.out.printf("I=%d J=%d\n", (int)i, (int)j[num]);
            }

            if(contador %3 == 0){//verifica se a variavel contador eh um multiplo de tres, se for verdadeiro
                i += 0.2;//soma 0.2 ao valor armazenado em i
                for(int x = 0; x < 3; x++){//laço de repetição para aumentar os valores 1,2 e 3 com o valor armazenado em i
                    j[x] = (x+1) +  i;
                }
                num = -1;//retorna o valor de num para -1 para acessar o vetor j em while
            }else{//se for falsa
                j[num]++;//aumenta o valor de j em 1
            }

            contador++;//aumenta a variavel que controla o aumento de i e j
            y++;//aumenta a variavel condicional de while
        }
    }    
}
