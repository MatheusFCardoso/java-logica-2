import java.util.Arrays;
import java.util.Scanner;

/* 2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */

public class Exercicio27
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        int n = 0;

        for(int c = 0; c < 3; c++  ){
            System.out.print("Digite um número: ");
            n = in.nextInt();
            array[0] = n;
        };

        System.out.println("O maior número informado é " + Arrays.stream(array).max().getAsInt());

        in.close();
    }
}
