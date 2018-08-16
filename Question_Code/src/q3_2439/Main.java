package q3_2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 1; i <= n; i++) {
			for(j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(k = 0; k < n-j ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
