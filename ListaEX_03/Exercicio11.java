package ListaEX_03;
import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args){

        System.out.println("Crie um programa que fique pedindo ao usuário um número qualquer entre 10 e 29. Depois sorteie um número qualquer (Randon) e compare os dois números. Caso sejam iguais exiba a mensagem “PARABÉNS! Você acertou!”. Caso contrário, exiba a mensagem “QUE PENA. Não foi desta vez. Tente novamente!”. Encerre o laço quando o usuário digitar 9.\n");

        System.out.println("-----------------------------------------------\n");

        int sorteio, numero;
        Scanner s = new Scanner(System.in);

        sorteio = (int)(Math.random() * (29 - 10 + 1)) + 10;
        
        do{
            System.out.print("Tente adivinhar o número entre 10 e 29: ");
            numero = s.nextInt();
            
            if(numero == 9){
                System.out.print("Jogo Encerrado!");
                break;
            }
            
            if (numero == sorteio){
                System.out.println("PARABÉNS! Você acertou!");
            } else{
                System.out.println("QUE PENA! Não foi dessa vez. Tente novamente!");
            }
        } while (true);


    }

}
