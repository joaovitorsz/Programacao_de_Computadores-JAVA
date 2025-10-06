package ListaEX_03;
import java.util.Scanner;

public class Exercicio15 {
    
    public static void main(String[] args){

        System.out.println("Crie uma função chamada “calculo”, com retorno double e que receba dois parâmetros double (num1 e num2). Quando num1 for maior que num2, ela deve retornar a multiplicação dos dois. Quando o num1 for menor que num2, deve-se retornar a divisão entre os dois. Quando eles forem iguais, deve-se retornar a soma deles. No final, exiba qual a condição atendida e o resultado do cálculo.\n");

        System.out.println("----------------------------------------------\n");

        double num1, num2, resultado;
        Scanner s = new Scanner(System.in);

        System.out.println("Insira dois números\n");
        System.out.print("Primeiro Número: ");
        num1 = s.nextDouble();

        System.out.print("Segundo Número: ");
        num2 = s.nextDouble();

        System.out.println("Realizando cálculos...\n");
        resultado = calculo(num1, num2);

        System.out.printf("O resultado do cálculo é: %.2f", resultado);

    }
    
    public static double calculo(double num1, double num2){
        
        double resultado;

        if (num1 > num2){
            System.out.println("A condição atendida foi: Número 1 > Número 2");
            resultado = num1 * num2;
        } else if(num1 == num2){
            System.out.println("A condição atendida foi: Número 1 = Número 2");
            resultado = num1 + num2;
        } else{
            System.out.println("A condição atendida foi: Número 1 < Número 2");
            resultado = num1 / num2;
        }

        return resultado;
        
    }


}
