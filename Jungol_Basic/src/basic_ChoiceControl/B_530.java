package basic_ChoiceControl;

import java.util.Scanner;

public class B_530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();

		if (age>=20) {
			System.out.println("adult");			
		}else {
			System.out.printf("%d years later", 20-age);
		}
	}

}
