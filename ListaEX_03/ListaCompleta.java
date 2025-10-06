package ListaEX_03;
import java.time.Year;
import java.util.Scanner;

public class ListaCompleta {
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n***MENU DE EXERCÍCIOS***\n");
            System.out.println("1 - Exercício 1");
            System.out.println("2 - Exercício 2");
            System.out.println("3 - Exercício 3");
            System.out.println("4 - Exercício 4");
            System.out.println("5 - Exercício 5");
            System.out.println("6 - Exercício 6");
            System.out.println("7 - Exercício 7");
            System.out.println("8 - Exercício 8");
            System.out.println("9 - Exercício 9");
            System.out.println("10 - Exercício 10");
            System.out.println("11 - Exercício 11");
            System.out.println("12 - Exercício 12");
            System.out.println("13 - Exercício 13");
            System.out.println("14 - Exercício 14");
            System.out.println("15 - Exercício 15");
            System.out.println("0 - Sair\n");

            System.out.print("Escolha um exercício: ");
            opcao = s.nextInt();

            System.out.print("\n");

            switch(opcao){
                case 1:
                    Exercicio01();
                    break;
                
                case 2:
                    Exercicio02();
                    break;
                
                case 3:
                    Exercicio03();
                    break;
                
                case 4:
                    Exercicio04();
                    break;
                
                case 5:
                    Exercicio05();
                    break;
                
                case 6:
                    Exercicio06();
                    break;
                
                case 7:
                    Exercicio07();
                    break;
                
                case 8:
                    Exercicio08();
                    break;
                
                case 9:
                    Exercicio09();
                    break;
                
                case 10:
                    Exercicio10();
                    break;
                
                case 11:
                    Exercicio11();
                    break;
                
                case 12:
                    Exercicio12();
                    break;
                
                case 13:
                    Exercicio13();
                    break;
                
                case 14:
                    Exercicio14();
                    break;
                
                case 15:
                    Exercicio15();
                    break;
                
            }

        } while (opcao != 0);
    
    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio01(){

        System.out.println("Faça um programa que peça dois números inteiros ao usuário. Depois exiba se o primeiro é maior, menor ou igual ao segundo.");

        System.out.println("--------------------------------------------------------\n");

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio02(){

        System.out.println("Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar (use o operador de resto da divisão - mod %).");

        System.out.println("----------------------------------------\n");

        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        num = s.nextInt();

        if (num % 2 == 0){
            System.out.print("O número indicado é par!");
        } else {
            System.out.print("O número indicado é Ímpar!");
        }

    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio03(){

        System.out.println("Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º do mês e no dia 30º do mesmo mês. Depois mostre quantos litros foram consumidos e a média por dia. considere 30 dias.");

        System.out.println("--------------------------------------------\n");

        double relogio1, relogio30, litros, media;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor do relógio no 1° dia do mês: ");
        relogio1 = s.nextDouble();

        System.out.print("Insira o valor do relógio no 30° dia do mês: ");
        relogio30 = s.nextDouble();

        litros = relogio30 - relogio1;
        media = litros / 30;

        System.out.printf("Nesse mês, foram gastos %.2f litros de água, e a média foi de %.0f litros por dia!", litros, media);

    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio04(){

        System.out.println("Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor que 100, calcule a potência dele elevado a 2. Se ele for maior que 100 ou menor que 10, exiba a raiz quadrada do valor. Exiba os valores com 5 casas decimais.");

        System.out.println("-------------------------------------------\n");

        int num;
        double resultado1, resultado2;
        Scanner s = new Scanner(System.in);

        System.out.print("Insira qualquer número inteiro: ");
        num = s.nextInt();

        resultado1 = Math.pow(num, 2);
        resultado2 = Math.sqrt(num);

        if (num >= 10 && num < 100){
            System.out.printf("O número selecionado elevado ao quadrado é: %.5f", resultado1);
        } else{
            System.out.printf("A raiz quadrada do número selecionado é: %.5f", resultado2);
        }

    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio05(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio06(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio07(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio08(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio09(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio10(){

        System.out.println("Imagine uma brincadeira entre dois colegas onde um fornece um número e o outro deve adivinhar qual é. Como dica, indique se o chute dado foi alto ou baixo em relação ao número escolhido. Pode sortear um número aleatório também. (repita)\n");

        System.out.println("-----------------------------------------------------\n");

        int escolhido, adivinhado;
        Scanner s = new Scanner(System.in);

        System.out.print("Escolha um número: ");
        escolhido = s.nextInt();
        
        do{
            System.out.print("Tente adivinhar o número: ");
            adivinhado = s.nextInt();

            if(escolhido > adivinhado){
                System.out.println("Seu chute foi baixo!");
            } else if (escolhido < adivinhado){
                System.out.println("Seu chute foi alto!");
            }
        } while (adivinhado != escolhido);

        System.out.println("Parabéns! Você adivinhou!");
    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio11(){

        System.out.println("Crie um programa que fique pedindo ao usuário um número qualquer entre 10 e 29. Depois sorteie um número qualquer (Randon) e compare os dois números. Caso sejam iguais exiba a mensagem “PARABÉNS! Você acertou!”. Caso contrário, exiba a mensagem “QUE PENA. Não foi desta vez. Tente novamente!”. Encerre o laço quando o usuário digitar 9.\n");

        System.out.println("-----------------------------------------------\n");

        int sorteio, numero;
        Scanner s = new Scanner(System.in);

        sorteio = (int)(Math.random() * (29 - 10 + 1)) + 10;
        
        do{
            System.out.print("Tente adivinhar o número entre 10 e 29: ");
            numero = s.nextInt();
            
            if(numero == 9){
                System.out.print("Jogo Encerrado!");
                break;
            }
            
            if (numero == sorteio){
                System.out.println("PARABÉNS! Você acertou!");
            } else{
                System.out.println("QUE PENA! Não foi dessa vez. Tente novamente!");
            }
        } while (true);


    }

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio12() {
        
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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio13(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio14(){

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

    //-----------------------------------------------------------------------------------------------------------------------------

    public static void Exercicio15(){

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


