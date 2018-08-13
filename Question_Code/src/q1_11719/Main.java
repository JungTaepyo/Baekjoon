package q1_11719;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		String message;
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextLine()) {
			message = scan.nextLine();
			System.out.println(message);
		}
		scan.close();
	}
}

