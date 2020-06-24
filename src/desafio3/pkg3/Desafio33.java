package desafio3.pkg3;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio33 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b, maior, menor;
        
        System.out.println("Qual o valor de a?");
        a = ler.nextDouble();
        System.out.println("Qual o valor de b?");
        b = ler.nextDouble();
        
        if (a > b) {
            maior = a;
            menor = b;
        }else {
            maior = b;
            menor = a;
        }
        if (maior%menor == 0) {
            System.out.println("São multiplos.");
        }else {
            System.out.println("Não são multiplos.");
        }
    }
}
