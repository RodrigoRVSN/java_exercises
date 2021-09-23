import java.text.DecimalFormat;
import java.util.Scanner;

public class weight {
	public static void main (String[] args) {
		double weight;
		System.out.println("Quantos quilos você pesa? ");
		Scanner inputWeight = new Scanner(System.in);
		weight = inputWeight.nextDouble();
		double weightInG = weight * 1000;
		double weightFatten = weightInG * 1.12;
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Seu peso em gramas equivale a: " + df.format(weightInG) + " g");
		System.out.println("Seu peso em gramas ao engordar 12% equivale a: " + df.format(weightFatten) + " g");
	}
}
