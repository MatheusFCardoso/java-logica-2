import java.util.Scanner;

//13 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

public class Exercicio13
{
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner in = new Scanner(System.in);

        for(int c = 0; c < 4; c++ ){

            System.out.print("Digite a nota do aluno: ");
            int n1 = in.nextInt();

            while( n1 > 10 || n1 < 0 ){
                System.out.print("Nota incorreta informe um número maior que 0 e menor que 10: ");
                n1 = in.nextInt();
            }

            soma += n1;

        }

        double media = soma/4;

        System.out.println("Sua média foi " + media);

        if( media >= 6 ){
            System.out.println("PARABÉNS Você foi aprovado !!");
        }

        in.close();


    }
}
