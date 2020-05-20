import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double largura, altura, area, perimetro;
		boolean flag = true;
		int opcao;
		
		System.out.print("Digite a largura do retangulo: ");
		largura = input.nextDouble();
		
		while (largura <= 0.0) {
			
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = input.nextDouble();
			
		}
		
		System.out.print("Digite a altura do retangulo: ");
		altura = input.nextDouble();
		
		while (altura <= 0.0) {
			
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = input.nextDouble();
			
		}
		
		
		while (flag) {
			
			System.out.println("\nMENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				area = largura * altura;
				System.out.printf("%nAREA = %.1f%n", area);
			}
			else if (opcao == 2) {
				perimetro = (largura * 2) + (altura * 2);
				System.out.printf("%nPERIMETRO = %.1f%n", perimetro);
			}
			else if (opcao == 3) {
				flag = false;
				break;
			} 
			else {
				System.out.println("\nOPCAO INVALIDA");
			}
			
		}
		
		System.out.println("FIM DO PROGRAMA!");
		
		input.close();

	}

}
