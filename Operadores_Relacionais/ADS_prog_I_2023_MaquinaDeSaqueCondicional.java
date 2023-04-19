import java.util.Scanner;
public class S10{
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        int saque,deCem,deVinte, deCinco, deUm,div;

        saque=1;

        while(saque>0){
            System.out.println("Informe o valor do saque: ");
            saque=teclado.nextInt();
        if(saque==0){
            System.out.println("Obrigado por utilizar nossos serviços.");
            break;
        }

        if (saque>99){
             div=100;
             deCem=saque/div;
            System.out.println(deCem + " de 100");
            saque=saque%100;
        }


        if(saque<100 && saque>=20){
            div=20;
            deVinte=saque/div;
            System.out.println(deVinte + " de 20");
            saque=saque%20;
        }


        if(saque<20 && saque>=5){
            div=5;
            deCinco=saque/div;
            System.out.println(deCinco + " de 5");
            saque=saque%5;
        }

        if(saque<5 && saque>=1){
            div=1;
            deUm=saque/div;
            System.out.println(deUm + " de 1");
        }
        saque=1;

        }
    }
}
