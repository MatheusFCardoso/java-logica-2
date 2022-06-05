import java.util.Scanner;

//21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo:

public class Exercicio21
{
    public static void main(String[] args)
    {
        double media = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double n1 = in.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double n2 = in.nextDouble();

        System.out.print("Digite a nota da prova optativa: ");
        double n3 = in.nextDouble();

        if(n3 > n1){
            media = n3 + n2;
        }else if(n3 > n2){
            media = n3 + n1;
        }else{
            media = n1 + n2;
        }

        if(media >= 6){
            System.out.println("APROVADO!!");
        }else if(media < 3){
            System.out.println("REPROVADO");
        }else{
            System.out.println("Exame");
        }

        in.close();
    }  
    
    
}
