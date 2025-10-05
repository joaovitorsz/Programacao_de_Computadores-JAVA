package ListaEX_03;
import java.util.Scanner;
import java.time.Year;

public class Exercicio07 {
    
    public static void main(String[] args){

        System.out.println("Faça um algoritmo que leia o ano de nascimento de uma pessoa, calcule e exiba se: ela já tem idade para votar (16 anos ou mais); se já tem idade para tirar habilitação (18 anos ou mais) ou se é menor de 16 anos “não pode nem votar nem tirar carteira”.\n");

        System.out.println("-------------------------------------------\n");

        int AnoNascimento, idade, AnoAtual;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira seu ano de nascimento: ");
        AnoNascimento = s.nextInt();

        AnoAtual = Year.now().getValue();
        idade = AnoAtual - AnoNascimento;

        if (idade < 16){
            System.out.print("Você tem " + idade + " anos. Não pode votar, nem tirar a carteira!");
        } else if(idade >= 16 && idade < 18){
            System.out.print("Você tem " + idade + " anos. Pode votar, mas ainda não tirar a carteira!");
        } else{
            System.out.print("Você tem " + idade + " anos. Pode votar e tirar a carteira!");
        }

    }

}