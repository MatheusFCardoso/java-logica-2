import java.util.Scanner;

//14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.

public class Exercicio14
{
    public static void main(String[] args)
    {
        int soma = 0;
        Scanner in = new Scanner(System.in);

        for(int c = 0; c < 4; c++ ){

            System.out.print("Digite a nota do aluno: ");
            int n1 = in.nextInt();

            while( n1 > 10 || n1 < 0 ){
                System.out.print("Nota incorreta informe um número maior que 0 e menor que 10: ");
                n1 = in.nextInt();
            }

            soma += n1;

        }

        double media = soma/4;

        System.out.println("Sua média foi " + media);

        if( media >= 6 ){
            System.out.println("PARABÉNS Você foi aprovado !!");
        }else{
            System.out.println("Infelizmente, você foi reprovado");
        }

        in.close();
    }
}
