package q4_10817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text = br.readLine();
		String[] word = text.split(" ");
		int a = Integer.parseInt(word[0]);
		int b = Integer.parseInt(word[1]);
		int c = Integer.parseInt(word[2]);
		
		if (a >= b && b >= c)
			System.out.println(b);
		else if (a <= b && b <= c)
			System.out.println(b);
		else if (a <= c && a >= b)
			System.out.println(a);
		else if (a >= c && a <= b)
			System.out.println(a);
		else if (c >= a && c <= b)
			System.out.println(c);
		else if (c >= b && c <= a)
			System.out.println(c);
			
	}
}
