import java.util.Scanner;

//6.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.

public class Exercicio6
{
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner in = new Scanner(System.in);
        for( int c = 0; c <10; c++ ){
            System.out.print("Digite um número: ");
            int n1 = in.nextInt();
            soma += n1;
        }
        
        System.out.println("A média da soma dos valores é " + soma/10);
        in.close();
    }    
}
