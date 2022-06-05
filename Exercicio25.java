import java.util.Scanner;

public class Exercicio25
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] array = new int[2];
        int n = 0;
        System.out.print("Digite a operação que você deseja realizar, 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação: ");
        int operacao = in.nextInt();

        for(int c = 0 ; c < 2; c++){
            System.out.print("Digite o número para calcular: ");
            n = in.nextInt();
            array[c] = n;
            
        
        }

        switch(operacao){

            

            case 1:

                System.out.println("ADIÇÃO !!");
                System.out.println("A soma desses valores é " + (array[0]  + array[1]  ));

            break;

            case 2:

                System.out.println("SUBTRAÇÃO !!");
                System.out.println("A subtração desses valores é " + (array[0] - array[1]  ));

            break;

            case 3:

                System.out.println("DIVISÃO !!");
                System.out.println("A divisão desses valores é " + (array[0]  / array[1]  ));

            break;

            case 4:

                System.out.println("MUTIPLICAÇÃO !!");
                System.out.println("A mutiplicação desses valores é " + (array[0]  * array[1]  ));

            break;

            default:

                System.out.println("Operação não encontra");


        }
        
        in.close();

    }
}
