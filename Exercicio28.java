import java.util.Scanner;


//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 
public class Exercicio28
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = in.nextInt();
        System.out.println("Digite outro número");
        int n2 = in.nextInt();
        System.out.println("Digite outro número");
        int n3 = in.nextInt();
        
        
        if(n1 < n2 && n1 < n3){
            System.out.println("A soma dos maiores números é " + (n2 + n3));
        }else if(n2 < n1 && n2 < n3){
            System.out.println("A soma dos maiores números é " + (n1 + n3));
        }else{
            System.out.println("A soma dos maiores números é " + (n1 + n2));
        }

        in.close(); 
    }
}