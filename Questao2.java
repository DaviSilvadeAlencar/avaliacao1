package avaliacao1;
import java.util.Scanner;
import java.util.Locale;
public class Questao2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a temperatura em C°: ");
		double c = sc.nextDouble();
		
		double f = (c * 9/5) + 32;
		double k = c + 273.15;
		
		System.out.print("Tempertatura em C°: " + c + 
				"\n Temperatura em °F: " + f + 
				"\n Temperatura em K: " + k);
		
		

	}

}
