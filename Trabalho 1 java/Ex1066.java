import java.io.IOException;
import java.util.Scanner;

public class Ex1066 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();	
		int numeros_pares = 0;
		int numeros_impares = 0;
		int numeros_positvos = 0;
		int numeros_negativos = 0;
		
		if(a %2 == 0) {
			numeros_pares++;
		}else {
			numeros_impares++;
		}
		
		if(a > 0) {
			numeros_positvos++;
		}
		
		else if(a == 0) {
			
		}
		
		else {
			numeros_negativos++;
		}
		
		if(b %2 == 0) {
			numeros_pares++;
		}else {
			numeros_impares++;
		}
		
		if(b > 0) {
			numeros_positvos++;
		}
		
		else if(b == 0) {
			
		}
		
		else {
			numeros_negativos++;
		}
		
		if(c %2 == 0) {
			numeros_pares++;
		}else {
			numeros_impares++;
		}
		
		if(c > 0) {
			numeros_positvos++;
		}
		
		else if(c == 0) {
			
		}
		
		else {
			numeros_negativos++;
		}
		
		if(d %2 == 0) {
			numeros_pares++;
		}else {
			numeros_impares++;
		}
		
		if(d > 0) {
			numeros_positvos++;
		}
		
		else if(d == 0) {
			
		}
		
		else {
			numeros_negativos++;
		}
		
		if(e %2 == 0) {
			numeros_pares++;
		}else {
			numeros_impares++;
		}
		
		if(e > 0) {
			numeros_positvos++;	
		}
		
		else if(e == 0) {
			
		}
		
		else {
			numeros_negativos++;
		}
		
		System.out.println("" + numeros_pares + " valor(es) par(es)");
		System.out.println("" + numeros_impares + " valor(es) impar(es)");
		System.out.println("" + numeros_positvos + " valor(es) positivo(s)");
		System.out.println("" + numeros_negativos + " valor(es) negativo(s)");
		
	}//static void
}
