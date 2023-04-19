package somaDeDoisNumeros;
import java.util.Scanner;
public class somaDeDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int a,b,r;
		a = teclado.nextInt();
		b=teclado.nextInt();

		r=soma(a,b);
		System.out.print("A soma dos valores é: " + r);

	}

	public static int soma(int x, int y) {
		int s=0;
		s=x+y;
		return s;
		}


}
