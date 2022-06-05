import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

//16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.

public class Exercicio16 {
    public static void main(String[] args) {

        Locale ptBr = new Locale("pt", "BR");
        

        Scanner in = new Scanner(System.in);
        System.out.print("Quantas maçâs você quer comprar: ");
        int quantidade = in.nextInt();

        if( quantidade < 12 ){
            System.out.println("Deu " + NumberFormat.getCurrencyInstance(ptBr).format(quantidade * 0.30) + " , cada maçã custou R$0.30" );
        }else{
            System.out.println("Deu " + NumberFormat.getCurrencyInstance(ptBr).format(quantidade * 0.25) + " , cada maçã custou R$0.25" );
        }

        in.close();
    }
}
