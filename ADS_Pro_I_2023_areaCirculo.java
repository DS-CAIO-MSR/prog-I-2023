import java.util.Scanner;
public class S05{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
    double pi;
    int area,raio,diametro;
    pi = 3.1415;
    
    System.out.println("Digite um diâmetro: ");
    diametro = teclado.nextInt();
    raio = diametro/2;
    area = raio*raio;
    System.out.printf("%.2f",area*pi);
    
    }
}
