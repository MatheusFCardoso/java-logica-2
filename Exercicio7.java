import java.util.Scanner;

//7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)

public class Exercicio7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = in.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = in.nextInt();

        System.out.print("Digite outro número: ");
        int n3 = in.nextInt();

        System.out.print("Digite outro número: ");
        int n4 = in.nextInt();

        if(n1 > n2 && n1 > n3 && n1 > n4){

            System.out.println("O maior número informado é " + n1);
            System.out.println("O primeiro número informado é " + n1 + ", E o último é " + n4);

        }else if(n2 > n1 && n2 > n3 && n2 > n4){

            System.out.println("O maior número informado é " + n2);
            System.out.println("O primeiro número informado é " + n1 + ", E o último é " + n4);  

        }else if(n3 > n1 && n3 > n2 && n3 > n4){

            System.out.println("O maior número informado é " + n3);
            System.out.println("O primeiro número informado é " + n1 + ", E o último é " + n4);  

        }else{

            System.out.println("O maior número informado é " + n4);
            System.out.println("O primeiro número informado é " + n1 + ", E o último é " + n4);  

        }

        in.close();

       
    }
}
