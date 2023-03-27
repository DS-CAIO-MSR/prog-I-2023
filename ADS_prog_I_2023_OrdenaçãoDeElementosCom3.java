import java.util.Scanner;
public class C05{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.println("Informe três números para ordenar: ");
        
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        if(a<=0||b<=0 ||c<=0){
            System.out.println("-");
        }else{
             // A B C
            if(a<=b && a<=c && b<=c){
              System.out.println(a+" "+b+" "+c);
            }else{
                 // B A C
                 if(b<=a && b<=c && a<=c){
                    System.out.println(b+" "+a+" "+c);
                }else{
                  // A C B
                if(a<=c && a<=b && c<=b){
                   System.out.println(a+" "+c+" "+b); 
                }else{
                     // C B A
                    if(c<=a && c<=b && b<=a){
                       System.out.println(c+" "+b+" "+a);
                    }else{
                        // C A B
                        if(c<=a && c<=b && a<=b){
                          System.out.println(c+" "+a+" "+b);
                            
                        }else{
                               // B C A
                           if(b<=c && b<=a && c<=a){
                               System.out.println(b+" "+c+" "+a); 
                            }     
                        }
            
                    }
           
                }
            
               }
             
            }
            
        }
       
    }
}
