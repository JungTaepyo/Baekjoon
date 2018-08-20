package q4_10871;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int number = scan.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < number)
				System.out.print(arr[i] + " ");
		}
	}
}
