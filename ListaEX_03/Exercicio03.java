package ListaEX_03;
import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args){

        System.out.println("Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º do mês e no dia 30º do mesmo mês. Depois mostre quantos litros foram consumidos e a média por dia. considere 30 dias.");

        System.out.println("--------------------------------------------");

        double relogio1, relogio30, litros, media;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor do relógio no 1° dia do mês: ");
        relogio1 = s.nextDouble();

        System.out.print("Insira o valor do relógio no 30° dia do mês: ");
        relogio30 = s.nextDouble();

        litros = relogio30 - relogio1;
        media = litros / 30;

        System.out.printf("Nesse mês, foram gastos %.2f litros de água, e a média foi de %.0f litros por dia!", litros, media);

    }

}
