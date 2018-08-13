package q2_2558;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a,b = 0;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
	}
}
