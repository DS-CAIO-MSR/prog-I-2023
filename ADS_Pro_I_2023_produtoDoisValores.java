import java.util.Scanner;
public class S01{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int priValor, segValor, resultado;
        
        System.out.println("Digite um valor :");
        
        priValor = teclado.nextInt();
        
        System.out.println("Digite outro valor :");
        
        segValor = teclado.nextInt();
        
        resultado = priValor*segValor;
        System.out.println("O resultado é : " + resultado);
        
    }
}
