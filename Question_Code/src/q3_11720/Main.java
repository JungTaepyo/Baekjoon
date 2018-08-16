package q3_11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String number = scan.next();
		scan.close();
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += number.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
