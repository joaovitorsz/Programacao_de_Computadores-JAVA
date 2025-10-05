package ListaEX_03;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args){

        System.out.println("Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor que 100, calcule a potência dele elevado a 2. Se ele for maior que 100 ou menor que 10, exiba a raiz quadrada do valor. Exiba os valores com 5 casas decimais.");

        System.out.println("-------------------------------------------");

        int num;
        double resultado1, resultado2;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira qualquer número inteiro: ");
        num = s.nextInt();

        resultado1 = Math.pow(num, 2);
        resultado2 = Math.sqrt(num);

        if (num >= 10 && num < 100){
            System.out.printf("O número selecionado elevado ao quadrado é: %.5f", resultado1);
        } else{
            System.out.printf("A raiz quadrada do número selecionado é: %.5f", resultado2);
        }

    }

}
