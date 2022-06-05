import java.util.Calendar;
import java.util.Scanner;

//15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

public class Exercicio15
{
    public static void main(String[] args) {
        
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o ano que você nasceu : ");
        int idade = in.nextInt();

        if(ano - idade >= 18){
            System.out.println("Você já pode votar");
        }else{
            System.out.println("Você não pode votar");
        }

        in.close();

    }    
}
