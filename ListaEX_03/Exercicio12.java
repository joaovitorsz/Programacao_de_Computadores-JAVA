package ListaEX_03;
import java.util.Scanner;

public class Exercicio12 {
    
    public static void main(String[] args) {
        
        System.out.println("Crie um laço de repetição que peça ao usuário 3 números inteiros e se ele deseja ordená-los em ordem crescente ou decrescente. Exiba os números conforme a ordem selecionada.\n");

        System.out.println("--------------------------------------\n");

        int num1 = 0, num2 = 0, num3 = 0, numero, contador = 1;
        String ordem;
        Scanner s = new Scanner(System.in);

        while(contador <=3){
            System.out.print("Digite o " + contador + " ° número: ");
            numero = s.nextInt();

            if(contador == 1){
                num1 = numero;
            } else if (contador == 2){
                num2 = numero;
            } else{
                num3 = numero;
            }

            contador++;
        }

        s.nextLine();
        System.out.print("Você deseja organizar os números em ordem crescente ou decrescente: ");
        ordem = s.nextLine();


        if(ordem.equalsIgnoreCase("crescente")){
            if (num1 <= num2 && num2 <= num3){
                System.out.print(num1 + ", " + num2 + ", " + num3);
            } else if (num1 <= num3 && num3 <= num2){
                System.out.print(num1 + ", " + num3 + ", " + num2);
            } else if (num2 <= num1 && num1 <= num3){
                System.out.print(num2 + ", " + num1 + ", " + num3);
            } else if (num2 <= num3 && num3 <= num1){
                System.out.print(num2 + ", " + num3 + ", " + num1);
            } else if (num3 <= num1 && num1 <= num2){
                System.out.print(num3 + ", " + num1 + ", " + num2);
            } else if (num3 <= num2 && num2 <= num1){
                System.out.print(num3 + ", " + num2 + ", " + num1);
            }
        } else if (ordem.equalsIgnoreCase("decrescente")){
            if (num1 >= num2 && num2 >= num3){
                System.out.print(num1 + ", " + num2 + ", " + num3);
            } else if (num1 >= num3 && num3 >= num2){
                System.out.print(num1 + ", " + num3 + ", " + num2);
            } else if (num2 >= num1 && num1 >= num3){
                System.out.print(num2 + ", " + num1 + ", " + num3);
            } else if (num2 >= num3 && num3 >= num1){
                System.out.print(num2 + ", " + num3 + ", " + num1);
            } else if (num3 >= num1 && num1 >= num2){
                System.out.print(num3 + ", " + num1 + ", " + num2);
            } else if (num3 >= num2 && num2 >= num1){
                System.out.print(num3 + ", " + num2 + ", " + num1);
            }
        } else{
            System.out.print("Ordem inválida!");
        }

    }

}
