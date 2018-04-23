package basic_Input;

import java.util.Scanner;

public class B_516 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		String c = sc.next();
		
		System.out.printf("%.2f%n%.2f%n%s%n", num1, num2, c);
	}

}
