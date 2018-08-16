package q3_2441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i,j,k = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(i = 0; i < n; i++) {
			for (j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < n-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
