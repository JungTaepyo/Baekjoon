package q3_2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int i = 0;
		for (i = 1; i <= n; i++) {
			for (int j = 0; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
