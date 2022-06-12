import java.util.Scanner;

/* 1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero. */

public class Exercicio26
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        
        int n1 = in.nextInt();

        if( 0 < n1){

            System.out.println("O seu número é positivo");

        }else if( 0 > n1 ){

            System.out.println("O seu número é negativo");

        }else{

            System.out.println("O seu número é 0");

        }

        in.close();

    }
}
