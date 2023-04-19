import java.util.Scanner;
public class C03{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int PriValor,SegValor;

        PriValor = teclado.nextInt();
        SegValor = teclado.nextInt();

        if( PriValor<=0 || SegValor<=0){
           System.out.println("Inválido");

        }else if(PriValor>SegValor){
            System.out.println("Primeiro");

        }else if(SegValor>PriValor){
            System.out.println("Segundo");

        }else{
            System.out.println("Iguais");
        }
    }
}
