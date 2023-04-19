import java.util.Scanner;
public class S08{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        double K,F,cons;
        cons = 0.5555;
        System.out.println("Informe uma temperatura em Fahrenheit: ");
        F = teclado.nextDouble();
        K = (F - 32) * cons + 273;
        System.out.printf("A temperatura em Kelvin é: %.1f", K);
    }
}
