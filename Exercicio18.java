import java.util.Scanner;

//18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:

public class Exercicio18
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual é o seu sexo ? Digite 1 para Feminino e 2 para Masculino: ");
        int sexo = in.nextInt();

        System.out.print("Digite sua sua altura: ");
        double altura = in.nextDouble();

        switch(sexo)
        {
            
            case 1:

                System.out.println("O seu peso ideal é " + (62.1 * altura - 44.7));

            break;

            case 2:

                System.out.println("O seu peso ideal é " + (72.7 * altura - 58));

            break;

            default:
                System.out.println("Número incoreto informado");
        }

        in.close();
    }    
}
