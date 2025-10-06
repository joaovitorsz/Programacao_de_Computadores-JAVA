package ListaEX_03;
import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args){

        System.out.println("Crie um validador de senha que peça ao usuário uma senha a ser verificada, o nome da pessoa, o sobrenome da pessoa e retorne o resultado da avaliação da senha (“Atende critérios” ou “Não atende Critérios”). Os critérios são:\r\n" + //
            "A senha deve conter no mínimo 8 caracteres.\r\n" + //
            "Pelo menos um dos caracteres deve ser ‘@’ ou ‘!’ ou ‘#’.\r\n" + //
            "Primeiro caractere da senha não pode ser o primeiro caractere do nome nem do sobrenome.\r\n" + //
            "");

        System.out.println("-------------------------------------\n");

        String senha, nome, sobrenome;
        char nome1, sobrenome1, senha1;
        boolean tamanho, caracterespecial, letra1;
        int i;
        Scanner s = new Scanner(System.in);

        System.out.println("Insira seu nome, sobrenome e a senha desejada:");
        
        System.out.print("Nome: ");
        nome = s.nextLine();

        System.out.print("Sobrenome: ");
        sobrenome = s.nextLine();

        System.out.print("Senha: ");
        senha = s.nextLine();


        nome1 = nome.charAt(0);
        sobrenome1 = sobrenome.charAt(0);
        senha1 = senha.charAt(0);
        
        
        tamanho = senha.length() >= 8;
        caracterespecial = senha.contains("@") || senha.contains("!") || senha.contains("#");
        letra1 = senha1 != nome1 && senha1 != sobrenome1;


        if(tamanho && caracterespecial && letra1){
            System.out.println("Senha atende critérios!");
        } else{
            System.out.print("Senha não atende critérios!");
        }

    }

}
