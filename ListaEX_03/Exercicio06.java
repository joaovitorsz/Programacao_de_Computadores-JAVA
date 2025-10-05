package ListaEX_03;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args){

        System.out.println("Tendo como dados de entrada a altura, o peso e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando as fórmulas abaixo e exiba se a pessoa está abaixo, no peso ou acima do peso ideal.\r\n" + //
                        "homens: (72.7 * H) - 58\r\n" + //
                        "mulheres: (62.1 * H) - 44.7\r\n" + //
                        "");

        System.out.println("----------------------------------------------\n");

        double altura, peso, PIhomem, PImulher;
        String sexo;
        Scanner s = new Scanner(System.in);

        System.out.println("Insira abaixo as seguintes informações");
        
        System.out.print("Altura (em centimetros): ");
        altura = s.nextDouble();

        System.out.print("Peso: ");
        peso = s.nextDouble();

        System.out.print("Sexo (masculino ou feminino): ");
        sexo = s.next();

        PIhomem = (72.7 * altura/100) - 58;
        PImulher = (62.1 * altura/100) - 44.7;
        
        if (sexo.equals("masculino")){
            if (peso < PIhomem){
                System.out.printf("Seu peso ideal é %.0f Kg. Você está abaixo do peso!", PIhomem);
            } else if( peso == PIhomem){
                System.out.printf("Seu peso ideal é %.0f Kg. Você está no peso ideal!", PIhomem);
            } else{
                System.out.printf("Seu peso ideal é %.0f Kg. Você está acima do peso!", PIhomem);
            }
        } else if (sexo.equals("feminino")){
            if(peso < PImulher){
                System.out.printf("Seu peso ideal é %.0f Kg. Você esta abaixo do peso!", PImulher);
            } else if(peso == PImulher){
                System.out.printf("Seu peso ideal é %.0f Kg. Você está no peso ideal!", PImulher);
            } else{
                System.out.printf("Seu peso ideal é %.0f Kg. Você está acima do peso!", PImulher);
            }
        } else{
            System.out.print("Sexo inválido! Insira (masculino) ou (feminino).");
        }

    }

}
