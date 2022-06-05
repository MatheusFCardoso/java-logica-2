import java.util.Scanner;

public class Exercicio19
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Quantos gol o Grêmio marcou ? ");
        int gremio = in.nextInt();

        System.out.print("Quantos gol o Inter marcou ? ");
        int inter = in.nextInt();

        if(gremio > inter){
            System.out.print("O Grêmio venceu o jogo");
        }else if(inter > gremio){
            System.out.println("O Inter venceu o jogo");
        }else{
            System.out.println("EMPATE");
        }

        in.close();

    }
}
