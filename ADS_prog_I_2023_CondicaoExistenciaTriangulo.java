public class C04{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        int a,b,c;
        System.out.println("Informe três segmentos de reta: ");
        a=teclado.nextInt();
        b=teclado.nextInt();
        c=teclado.nextInt();
        
        while(a<=0 || b<=0 || c<=0){
            System.out.println("Inválido, " + "Digite novamente: ");
            a=teclado.nextInt();
            b=teclado.nextInt();
            c=teclado.nextInt();
        }
        if(a+b>c && a+c>b && b+c>a){
          System.out.print("Sim");   
        }else{
             System.out.print("Não");
        }
    }
}


//"a soma de dois lados é sempre maior que o terceiro lado."
