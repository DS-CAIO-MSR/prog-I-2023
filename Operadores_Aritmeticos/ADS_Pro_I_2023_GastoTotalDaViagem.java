import java.util.Scanner;
public class S082{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
    double consumo, litro,consuLitros, distancia,vTotPedagios, vPedagios, gasTotal;    
    int nPedagios;  
    System.out.println("Informe o consumo do carro em km/L: ");
     consumo = teclado.nextDouble();

    System.out.println("Informe o valor do litro de combustível: ");
     litro = teclado.nextDouble();

    System.out.println("Informe a distância percorrida: ");
     distancia = teclado.nextDouble();

    System.out.println("Informe a quantidade de pedágios");
     nPedagios = teclado.nextInt();

    System.out.println("Informe o valor de cada pedágio: ");
    vPedagios = teclado.nextDouble();

    consuLitros = (distancia/consumo)*litro;

    gasTotal = consuLitros + ((double)nPedagios*vPedagios);

    System.out.printf("Seu gasto total na viagem foi: R$ %.2f ", gasTotal);
    }

}
