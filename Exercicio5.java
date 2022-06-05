import java.util.Scanner;

//5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro.

public class Exercicio5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = in.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = in.nextInt();

        if( n1 > n2){
            System.out.println("O primeiro número é o maior");
        }else if(n2 > n1){
            System.out.println("O segundo número é  o maior");
        }else{
            System.out.println("Os números são iguais");
        }

        in.close();

    }    
}
