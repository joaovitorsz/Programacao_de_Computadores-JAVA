package ListaEX_03;
import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args){

        System.out.println("Imagine uma brincadeira entre dois colegas onde um fornece um número e o outro deve adivinhar qual é. Como dica, indique se o chute dado foi alto ou baixo em relação ao número escolhido. Pode sortear um número aleatório também. (repita)\n");

        System.out.println("-----------------------------------------------------\n");

        int escolhido, adivinhado;
        Scanner s = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        escolhido = s.nextInt();
        
        do{
            System.out.print("Tente adivinhar o número: ");
            adivinhado = s.nextInt();

            if(escolhido > adivinhado){
                System.out.println("Seu chute foi baixo!");
            } else if (escolhido < adivinhado){
                System.out.println("Seu chute foi alto!");
            }
        } while (adivinhado != escolhido);

        System.out.println("Parabéns! Você adivinhou!");
    }

}
