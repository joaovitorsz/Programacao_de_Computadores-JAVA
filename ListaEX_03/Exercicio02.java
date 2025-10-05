package ListaEX_03;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args){

        System.out.println("Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar (use o operador de resto da divisão - mod %).");

        System.out.println("----------------------------------------\n");

        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num = s.nextInt();

        if (num % 2 == 0){
            System.out.print("O número indicado é par!");
        } else {
            System.out.print("O número indicado é Ímpar!");
        }

    }

}
