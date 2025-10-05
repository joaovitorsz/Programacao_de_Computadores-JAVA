package ListaEX_03;
import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args){

        System.out.println("Faça um algoritmo que, dada a idade de um nadador, mostre a qual classificação ele pertence conforme a tabela abaixo:\n" + //
                    "\n" + //
                    "Idade---------------------------Categoria\n" + //
                    "\n" + //
                    "5 até 7 anos--------------------Infantil A\n" + //
                    "8 até 10 anos-------------------Infantil B\n" + //
                    "11 a 13 anos--------------------Juvenil A\n" + //
                    "14 a 17 anos--------------------Juvenil B\n" + //
                    "18 ou mais----------------------Adulto\n");

        System.out.println("---------------------------------\n");

        int idade;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        idade = s.nextInt();

        if (idade < 5){
            System.out.print("Ainda não tem idade para nadar!");
        } else if(idade >= 5 && idade <= 7){
            System.out.print("Está na categoria Infantil A!");
        } else if(idade >= 8 && idade <= 10){
            System.out.print("Está na categoria Infantil B!");
        } else if(idade >= 11 && idade <= 13){
            System.out.print("Está na categoria Juvenil A!");
        } else if(idade >= 14 && idade <= 17){
            System.out.print("Está na categoria Juvenil B!");
        } else{
            System.out.print("Está na categoria Adulto!");
        }


    }

}
