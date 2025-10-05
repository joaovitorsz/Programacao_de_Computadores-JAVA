package ListaEX_03;
import java.util.Scanner;

public class Exercicio01 {
   
    public static void main(String[] args){

        System.out.println("Faça um programa que peça dois números inteiros ao usuário. Depois exiba se o primeiro é maior, menor ou igual ao segundo.");

        System.out.println("--------------------------------------------------------");

        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        num1 = s.nextInt();

        System.out.print("Insira o segundo número: ");
        num2 = s.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo!");
        } else if (num1 == num2){
            System.out.print("O primeiro e o segundo número são iguais!");
        } else{
            System.out.print("O segundo número é maior que o primeiro!");
        }

    }
    
}
