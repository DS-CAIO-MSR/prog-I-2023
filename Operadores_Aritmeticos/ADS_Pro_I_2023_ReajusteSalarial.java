import java.util.Scanner;

public class S06{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
      double salario,reajuste,NovoSalario;

    System.out.println("Informe o valor salarial: ");
      salario = teclado.nextDouble();
    System.out.println("Informe a porcentagem de reajuste: ");
      reajuste = teclado.nextDouble();
      reajuste =reajuste/100*salario;
      System.out.printf("O salario atualizado é: %.2f",reajuste+salario);

    }
}
