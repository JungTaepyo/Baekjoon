package q2_10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b,c = 0;
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			System.out.println((a+b) % c);
			System.out.println((a%c + b%c) % c);
			System.out.println((a*b) % c);
			System.out.println((a%c * b%c) % c);
		}
		scan.close();
	}
}
