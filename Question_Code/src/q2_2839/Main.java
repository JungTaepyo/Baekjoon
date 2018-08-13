package q2_2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sugar;
		
		Scanner scan = new Scanner(System.in);
		sugar = scan.nextInt();
		
		switch(sugar % 5) {
		case 0:
			System.out.println(sugar / 5);
			break;
		case 1 :
			System.out.println((sugar / 5) + 1);
			break;
		case 2 :
			if (sugar == 7) {
				System.out.println("-1");
				break;
			}
			else {
				System.out.println((sugar / 5) + 2);
				break;
			}
		case 3 :
				System.out.println((sugar / 5) + 1);
				break;
		case 4 :
			if (sugar == 4) {
				System.out.println("-1");
			}
			else {
				System.out.println((sugar / 5) + 2);
				break;
			}
		}
		scan.close();
	}
}
