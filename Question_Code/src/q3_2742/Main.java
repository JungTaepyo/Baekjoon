package q3_2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		
		for (int j = 0; j < 9; j++) {
			System.out.println(i * (j + 1));
		}
		scan.close();
	}

}
