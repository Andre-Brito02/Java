import java.io.IOException;
import java.util.Scanner;

public class Ex1049 {
    public static void main(String[] args)throws IOException{
		Scanner s = new Scanner(System.in);
		
		String tipo = s.next();
		String v = "vertebrado";
		String i = "invertebrado";
		String a = "ave";
		String c = "carnivoro";
		String o = "onivoro";
		String m = "mamifero";
		String h = "herbivoro";
		String in = "inseto";
		String he = "hematofago";
		String an = "anelideo";
		
		if(tipo.equals(v)) {
			tipo = s.next();
			
			if(tipo.equals(a)) {
				tipo = s.next();
				
				if(tipo.equals(c)) {
					System.out.println("aguia");
				}
				
				else if(tipo.equals(o)) {
					System.out.println("pomba");
				}//else pomba
			}//if ave
			
			else if(tipo.equals(m)) {
				tipo = s.next();
				
				if(tipo.equals(o)) {
					System.out.println("homem");
				}
				
				else if(tipo.equals(h)) {
					System.out.println("vaca");
				}//else vaca
			}//if mamifero
		}//if vertebrado
		
		else if(tipo.equals(i)) {
			tipo = s.next();
			
			if(tipo.equals(in)) {
				
				tipo = s.next();
				
				if(tipo.equals(he)) {
					System.out.println("pulga");
				}
				
				else if(tipo.equals(h)) {
					System.out.println("lagarta");
				}//else lagarta
			}//if inseto
			
			else if(tipo.equals(an)) {
				tipo = s.next();
				
				if(tipo.equals(he)) {
					System.out.println("sanguessuga");
				}
				
				else if(tipo.equals(o)){
					System.out.println("minhoca");
				}//else minhoca
			}//if anelideo
		}//else if invertebrado		
		
	}//static void
}
