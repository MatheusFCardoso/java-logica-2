import java.util.Scanner;

/*20 - Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
Calcular e imprimir o seguinte: 
Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro. 
Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
Se o número de lados for igual a 5 escrever PENTÁGONO. 

Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 

Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.*/

public class Exercicio20
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de lados do seu poligno: ");
        int lados = in.nextInt();

        System.out.print("Digite o valor do lado desse poligno: ");
        int valor = in.nextInt();

        if(lados < 3){
            System.out.println("NÃO É UM POLÍGONO");
        }else{

            switch(lados){

                case 3:
    
                    System.out.println("Voce tem um TRIÂNGULO, o perímetro dele é" + lados * valor  );
    
                break;
    
                case 4:
    
                    System.out.println("Voce tem um QUADRADO, o perímetro dele é" + lados * valor  );
    
                break;
    
                case 5:
    
                    System.out.println("Voce tem um PENTÁGONO, o perímetro dele é" + lados * valor  );
    
                break;
    
                default:
    
                    System.out.println("POLÍGONO NÃO IDENTIFICADO");
            }
            
        }

        

        in.close();

    }
}
