import java.util.Scanner;
public class S09{
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int horas, minutos, segundos,totalhoras, totalminutos, totalsegundos;
    
    System.out.println("Informe quantas horas: ");
     horas = teclado.nextInt();
    System.out.println("Informe quantos minutos: ");
     minutos = teclado.nextInt();
    System.out.println("Informe quantos segundos: ");
     segundos = teclado.nextInt();
     
     totalhoras=(horas*60)*60;
     totalminutos=minutos*60;
     totalsegundos=totalhoras+totalminutos+segundos;
    
    System.out.println("O total de segundos é: " +totalsegundos);
    }
}
