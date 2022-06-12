import java.util.Scanner;

/* 5 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). */

public class Exercicio30
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int soma = 0; 
        int n = 0;

        for(int c = 0; c < 4; c++ ){
            System.out.print("Digite a " +(c+1) + "º nota do semestre :");
            n = in.nextInt();
            soma += n;
        }

        if(soma/4 >= 6 ){
            System.out.println("APROVADO!!");
        }else{
            System.out.println("REPROVADO!!");
        }

        in.close();
    }
}
