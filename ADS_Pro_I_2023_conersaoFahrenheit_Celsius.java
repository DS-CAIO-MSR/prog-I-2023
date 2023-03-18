import java.util.Scanner;
public class S07{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double F,C,Conver,cons;
        cons = 1.8;
        System.out.println("Informe uma temperatura em Fahrenheit: ");
        F = teclado.nextDouble();
        C = (F - 32)/ cons;
        System.out.printf("%.1f",C);
        
        
    }
}
