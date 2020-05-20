import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double largura;
		
		System.out.print("Digite a largura do retangulo: ");
		largura = input.nextDouble();
		
		while (largura <= 0.0) {
			
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = input.nextDouble();
			
		}
		
		
		
		input.close();

	}

}
