package basic_Input;

import java.util.Scanner;

public class B_109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.printf("sum = %d%navg = %d", num1+num2+num3, (num1+num2+num3)/3);
	}

}
