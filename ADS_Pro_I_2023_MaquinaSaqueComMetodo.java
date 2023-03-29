import java.util.Scanner;
public class MaquinaSaque{
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
            
            if(saque>100){
                div=100;
                deCem=cedulas(saque,div);
                System.out.println(deCem + " de 100");
                saque=resto(saque, div);
            }
            
            
            if(saque<100 && saque>=20){
                div=20;
                deVinte=cedulas(saque,div);
                System.out.println(deVinte + " de 20");
                saque=resto(saque, div);
                
            }
            if(saque<20 && saque>=5){
                div=5;
                deCinco=cedulas(saque,div);
                System.out.println(deCinco + " de 5");
                saque=resto(saque, div);
            }
            if(saque<5 && saque>=1){
                div=1;
                deUm=cedulas(saque,div);
                System.out.println(deUm + " de 1");
                saque=resto(saque, div);
            }
            saque=1;
        }    
   
    }
    public static int cedulas(int saque, int div){
    int notas;
    notas=saque/div;
    return notas;
        
    }
    public static int resto(int saque, int div){
    int s;
    s=saque%div;
    return s;
        
    }
    
}
