import java.util.Scanner;
public class C07{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int HIni,MinIni,HFim,MinFim;
        HIni=teclado.nextInt();
        MinIni=teclado.nextInt();

        HFim=teclado.nextInt();
        MinFim=teclado.nextInt();
        if(HIni<0 || HFim<0 || MinIni<0 || MinFim<0){//ok
            System.out.println("-");
        }else{
            if(HIni<HFim){
              if(MinIni<MinFim){
                System.out.println((HFim - HIni) + ":" + (MinFim - MinIni));//ok

              }else if(MinFim<MinIni){
                System.out.println(((HFim - HIni)- 1) + ":"+ ((MinFim + 60)-MinIni));//ok

              }else{
                System.out.println(HFim - HIni + ":00" );//ok

              }

            }

            if(HIni==HFim){
              if(MinIni<MinFim){
                System.out.println("24" + ":" + (MinFim-MinIni));//ok

              }else if(MinFim<MinIni){
                System.out.println("23" + ":" + ((MinFim + 60)-MinIni));//ok

              }else{
                System.out.println("24:00");//ok

              }

            }
            if(HIni>HFim){
              if(MinIni<MinFim){
                System.out.println(((HFim + 24)-HIni)+":"+(MinFim - MinIni));//ok

              }else if(MinIni==MinFim){
                System.out.println(((HFim + 24)-HIni) + ":00");//ok

              }else{// MinFim<MinIni
                System.out.println(((HFim + 23)-HIni) +":"+ ((MinFim + 60)- MinIni));

              }
            }



        }




    }
}
