import java.util.Arrays;
import java.util.Scanner;

//24 - Um zoológico muito louco
//Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais novo com a girafa mais velha.

public class Exercicio24
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] javali = new int[2];
        int[] girafa = new int[2];
        int n = 0;

        for(int c = 0; c < 2; c++  ){
            System.out.print("Digite a idade do " + (c+1) + "º Javali: ");
            n = in.nextInt();
            javali[c] = n;
        }

        for(int c = 0; c < 2; c++  ){
            System.out.print("Digite a idade do " + (c+1) + "º Girafa: ");
            n = in.nextInt();
            girafa[c] = n;
        }

        System.out.println("A idade do Javali mais velho com a girafa mais nova é " + ( Arrays.stream(javali).max().getAsInt() + Arrays.stream(girafa).min().getAsInt() ));

        System.out.println("A idade da Girafa mais velha com o javali mais novo é " + ( Arrays.stream(javali).min().getAsInt() + Arrays.stream(girafa).max().getAsInt() ));

        in.close();

    }
}