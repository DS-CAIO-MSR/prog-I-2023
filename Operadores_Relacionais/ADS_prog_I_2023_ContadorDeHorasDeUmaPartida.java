import java.util.Scanner;
public class C06{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, TotalHoras;

        System.out.println("Insira o horário de início da partida: ");
        inicio = teclado.nextInt();
        System.out.println("Insira o horário da fim da partida: ");
        fim = teclado.nextInt();
        TotalHoras=0;

        if(inicio<0 || inicio>24 || fim<0 || fim>24){
          System.out.println("-");
        }

        if(inicio==fim){
          System.out.println("24");
        }

        if(inicio<fim){
          TotalHoras = fim-inicio;
          System.out.println(TotalHoras);
        }

        if(inicio>fim){
          TotalHoras = (24 - inicio)+fim;
          System.out.println(TotalHoras);
        }
    }
}
