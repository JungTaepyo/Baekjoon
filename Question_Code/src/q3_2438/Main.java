package q3_2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		int i;
		int j;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(i = 1; i <= n; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
