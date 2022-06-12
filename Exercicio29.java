import java.util.Scanner;

/* 4.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos. */

public class Exercicio29
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int soma = 0;

        for(int c = 0; c < 10; c++){
            System.out.print("Digite um número: ");
            n = in.nextInt();
            soma += n;
        }

        System.out.println("A média dos números informados é " + soma/10);
        
        in.close();
    }
}
