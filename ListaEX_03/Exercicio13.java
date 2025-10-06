package ListaEX_03;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args){

        System.out.println("Solicite ao usuário uma palavra. Use um laço “for” para percorrer a string e estruturas de decisão (if-else ou switch) para contar o número total de vogais (a, e, i, o, u) e o número total de consoantes. Ignore os espaços. Exiba o número de vogais e o número de consoantes que a palavra informada possui.\n");

        System.out.println("-------------------------------\n");

        String palavra;
        char letra;
        int i, contadorvogais = 0, contadorconsoantes = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        palavra = s.nextLine();

        for (i = 0; i < palavra.length(); i++){
            letra = palavra.charAt(i);

            if(letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'o' || letra == 'O' || letra == 'i' || letra == 'I' || letra == 'u' || letra == 'U'){
                contadorvogais++;
            } else if (letra != ' '){
                contadorconsoantes++;
            }
        }

        System.out.println("A quantidade de vogais da palavra é " + contadorvogais + ", enquanto a quantidade de consoantes é " + contadorconsoantes + ".");

    }
    
}
