import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");    
        int n1 = in.nextInt();

        if(n1 > 0){
            System.out.println("O número informado é positivo");
        }else if(n1 < 0){
            System.out.println("O número informado é negativo");
        }else{
            System.out.println(" O número informado é ZERO");
        }

        in.close();
    }    
}
