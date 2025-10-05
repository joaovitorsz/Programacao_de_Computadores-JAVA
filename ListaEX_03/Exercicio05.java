package ListaEX_03;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args){

        System.out.println("Dado os três valores, A, B e C, verificar se eles podem ser os comprimentos dos lados de um triângulo, se forem, verificar se compõem um triângulo equilátero, isósceles ou escaleno. Dados de Entrada: Três lados de um suposto triângulo A, B e C. Dados de saída: mensagens: não compõem um triângulo, triângulo equilátero, triângulo isósceles, triângulo escaleno. \r\n" + //
                        "É um triângulo?: Figura geométrica fechada de três lados, em que cada um é menor que a soma dos outros dois. \r\n" + //
                        "Triângulo equilátero: possui três lados iguais.\r\n" + //
                        "Triângulo isósceles: possui dois lados iguais.\r\n" + //
                        "Triângulo escaleno: possui todos os lados diferentes.\r\n" + //
                        "");

        System.out.println("-------------------------------------------\n");

        double ladoA, ladoB, ladoC;
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os valores de cada lado do triângulo.");
        
        System.out.print("Lado A: ");
        ladoA = s.nextInt();

        System.out.print("Lado B: ");
        ladoB = s.nextInt();

        System.out.print("Lado C: ");
        ladoC = s.nextInt();

        if (((ladoA + ladoB) > ladoC) && ((ladoB + ladoC) > ladoA) && ((ladoA + ladoC) > ladoB)){
            if (ladoA == ladoB && ladoB == ladoC){
                System.out.print("Possui três lados iguais. É um triângulo equilátero!");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.print("Possui dois lados iguais. É um triângulo isósceles!");
            } else{
                System.out.print("Possui todos os lados diferentes. É um triângulo escaleno!");
            }
        } else{
            System.out.print("Não compõem um triângulo!");
        }


    }

}
