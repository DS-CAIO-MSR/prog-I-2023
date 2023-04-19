import java.util.Scanner;
public class S04{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        double notas[] = new double[3];
        double peso[] = new double[3];
        double media,totalNotas,totalPesos;
        totalNotas=0;
        totalPesos=0;

        for(int i=0;i<=2;i++){
            System.out.println("Digite a nota e o peso: ");
            notas[i]=teclado.nextDouble();
            peso[i]=teclado.nextDouble();
        }
        for(int i=0;i<=2;i++){
            totalNotas=totalNotas+notas[i]*peso[i];
            totalPesos=totalPesos+peso[i];
        }
    media = totalNotas/totalPesos;
    System.out.printf("%.2f",media);
    }
}
