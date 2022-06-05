import java.util.Scanner;

//1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.


public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        System.out.println("Digite outro número:");
        int n2 = in.nextInt();

        if(n1 > n2){
            System.out.println(n1 + " É o maior número informado");
        }else{
            System.out.println(n2 + " É o maior número informado");
        }

        in.close();

    }
}