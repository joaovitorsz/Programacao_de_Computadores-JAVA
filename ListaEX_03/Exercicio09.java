package ListaEX_03;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args){

    System.out.println("Construa um algoritmo que calcule a soma de números pares que o usuário informar enquanto ele não digitar zero. O usuário pode informar qualquer número entre 0 e 100, mas só deve ser somado se ele for par. Encerrar o laço quando o usuário digitar 0.\n");
    
    System.out.println("--------------------------------------\n");

    int numero, soma = 0;
    Scanner s = new Scanner(System.in);

    do{
        System.out.print("Insira um número: ");
        numero = s.nextInt();

        if(numero % 2 == 0 && numero != 0){
            soma += numero;
        }

    } while (numero != 0);
    
    System.out.print("A soma dos números pares informados é: " + soma);
    

}

}
