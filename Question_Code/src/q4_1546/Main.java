package q4_1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] scores = new int[size];
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = scan.nextInt();
		}
		
		int max = scores[0];
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		
		double sum = 0;
		
		double[] new_scores = new double[size];
		
		for (int i = 0; i < scores.length; i++) {
			new_scores[i] = scores[i] / (double)max * 100;
			sum += new_scores[i];
		}
		
		double average = sum / size;
		average = Double.parseDouble(String.format("%.2f", average));
		
		System.out.println(average);
		
	}
}
