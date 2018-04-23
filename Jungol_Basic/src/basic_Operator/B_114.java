package basic_Operator;

import java.util.Scanner;

public class B_114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d %d%n", (++a), (b--));
		System.out.printf("%d %d", a, b);
	}

}
