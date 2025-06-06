package avaliacao1;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite sua segunda nota: "); 
		double n2 = sc.nextDouble();
		
		System.out.print("Digite sua terceira nota: ");
		double n3 = sc.nextDouble();
		
		System.out.print("Digite sua quarta nota: ");
		double n4 = sc.nextDouble();
		
		System.out.print("Digite sua quinta nota: ");
		double n5 = sc.nextDouble();
		
		System.out.print("Digite sua sexta nota: ");
		double n6 = sc.nextDouble();
		
		System.out.print("Digite sua sétima nota: ");
		double n7 = sc.nextDouble();
		
		System.out.print("Digite sua oitava nota: ");
		double n8 = sc.nextDouble();
		
		double mb1 = n1 + n2/2;
		
		double mb2 = n3 + n4/2;
		
		double ms1 = mb1 + mb2/2;
		
		double mb3 = n5 + n6/2;
		
		double mb4 = n7 + n8/2;
		
		double ms2 = mb3 + mb4/2;
		
		double mf = ms1 + ms2/2;
		
		System.out.print("Média primeiro bimestre: " + mb1 +
				         "\n Média segundo bimestre: " + mb2 + 
				         "\n Média primeiro semestre: " + ms1 + 
				         "\n Média terceiro bimestre: " + mb3 + 
				         "\n Média quarto bimestre: " + mb4 +
				         "\n Média segundo semestre: " + ms2 + 
				         "\n Média final: " + mf);
		
		
		
		
		
		
		
		

	}

}
