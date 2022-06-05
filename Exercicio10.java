import java.util.Scanner;

//10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

public class Exercicio10
{
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner in = new Scanner(System.in);

        for(int c = 0; c < 4; c++ ){

            System.out.print("Digite um número: ");
            int n1 = in.nextInt();

            while( n1 > 10 || n1 < 0 ){
                System.out.print("Número incorreto informe um número maior que 0 e menor que 10: ");
                n1 = in.nextInt();
            }

            soma += n1;

        }

        double media = soma/4;

        if( media >= 5 ){
            System.out.println("Você passou no teste!!");
        }else{
            System.out.println("Tente novamente"); 
        }

        in.close();


    }
}
