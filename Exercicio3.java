import java.util.Scanner;

//3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class Exercicio3
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
        
        
        if(n1 > n2 && n1 > n3){
            System.out.println("O " +n1+ " é o maior número !!");
        }else if(n2 > n1 && n2 > n3){
            System.out.println("O " +n2+ " é o maior número !!");
        }else{
            System.out.println("O " +n3+ " é o maior número !!");
        }

        in.close();

    }
}
