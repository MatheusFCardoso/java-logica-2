import java.util.Scanner;

//8. Faça um programa que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.

public class Exercicio8 
{
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner in = new Scanner(System.in);   
        
        for(int c = 0; c < 10; c++){
            System.out.print("Digite um número: ");
            int n1 = in.nextInt();

            soma += n1;
        }

        System.out.println("A soma dos números informados é " + soma);

        in.close();

    }
    
}
