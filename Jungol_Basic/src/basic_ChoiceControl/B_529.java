package basic_ChoiceControl;

import java.util.Scanner;

public class B_529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int weight = sc.nextInt();

		int fat = weight+100-height;

		System.out.println(fat);

		if(fat>0) {
			System.out.print("Obesity");
		}
	}

}
