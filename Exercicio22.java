import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

public class Exercicio22
{
    public static void main(String[] args)
    {
        Locale ptBr = new Locale("pt", "BR");
        Scanner in = new Scanner(System.in);
        System.out.println("Cada capacete artesanal para tartaruga custa R$ 182.30 poder ser pago até 15 vezes esem juros.");
        System.out.print("Digite em quantas vezes você deseja pagar: ");
        int parcela = in.nextInt();

        System.out.println("Você págara " + NumberFormat.getCurrencyInstance(ptBr).format(182.30 / parcela) + " em cada parcela.");
        
        in.close();
    }
}
