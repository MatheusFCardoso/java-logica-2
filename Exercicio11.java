import java.util.Scanner;

//11 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.

public class Exercicio11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos calcular o seu lucro diário !!");

        System.out.print("Informe o valor do odômetro: ");
        int inicio = in.nextInt();

        System.out.print("Informe o valor do odômetro do final do dia: ");
        int fim = in.nextInt();

        System.out.print("O quanto você recebeu no dia: ");
        int dinheiro = in.nextInt();

        double combustivel = (fim - inicio)/ 14 ;

        System.out.println("O seu carro consumiu hoje " + combustivel + ", você teve um lucro líquido diário de " + (  dinheiro - combustivel * 2.90 ) + "R$" );

        in.close();
    }
}