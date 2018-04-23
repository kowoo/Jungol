package basic_ChoiceControl;

import java.util.Scanner;

public class B_532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		if(a>=4 && b>=4) {
			System.out.print("A");
		} else if(a>=3 && b>=3) {
			System.out.print("B");
		} else {
			System.out.print("C");
		}
	}

}
