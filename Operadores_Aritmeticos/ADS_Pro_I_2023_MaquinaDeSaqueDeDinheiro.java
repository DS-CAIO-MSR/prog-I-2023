import java.util.Scanner;
public class S10{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        int saque,deCem,deVinte, deCinco, deUm;

        System.out.println("Informe o valor do saque: ");
        saque=teclado.nextInt();

        deCem = saque/100;
        System.out.println(deCem + " de 100");

        saque=saque%100;

        deVinte=saque/20;
        System.out.println(deVinte + " de 20");

        saque=saque%20;

        deCinco=saque/5;
        System.out.println(deCinco + " de 5");

        saque=saque%5;

        deUm=saque/1;
        System.out.println(deUm + " de 1");



    }
}
