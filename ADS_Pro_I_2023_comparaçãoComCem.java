import java.util.Scanner;
public class C01{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int valor;
        
        System.out.println("Informe um valor de comparação com 100: ");
        
        valor=teclado.nextInt();
        if(valor>100){
            System.out.println("Sim");
        }else if(valor==100){
            System.out.println("Esse valor é Igual");
        }else{
            System.out.println("Não");
        }
    }
}
