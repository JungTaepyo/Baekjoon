package q2_10869;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
		}
	}

}
