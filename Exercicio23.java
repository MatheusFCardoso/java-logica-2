import java.util.Arrays;
import java.util.Scanner;

//23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

public class Exercicio23
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];
        for(int c = 0; c < 20; c++){

            System.out.print("Digite um número: ");
            int n = in.nextInt();
            array[c] = n;
            

        }

        System.out.println("Os valores que você informou são " +  Arrays.toString(array) + " , O maior valor informado é " + Arrays.stream(array).max().getAsInt() + ", O menor valor informado é " + Arrays.stream(array).min().getAsInt() );
        in.close();
    }
}
