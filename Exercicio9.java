import java.util.Arrays;
import java.util.Scanner;

//9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou. 

public class Exercicio9
{
    public static void main(String[] args)
    {
        int soma = 0;
        int[] array = new int[6];
        Scanner in = new Scanner(System.in);
        
        for( int c = 0 ; c < 6; c++){
            System.out.print("Digite um número: ");
            int n1 = in.nextInt();

            if(n1 < 72 ){
                soma += n1;
            }

            array[c] = n1;

        }

        System.out.println("A soma dos valores informados que são menores que 72 é " + soma);
        System.out.println("Os valores que você informou são " +  Arrays.toString(array));

        in.close();
    }
}
