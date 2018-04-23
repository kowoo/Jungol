package basic_ChoiceControl;

import java.util.Scanner;

public class B_632 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min1 = a<b? a: b;
		int min2 = b<c? b: c;
		int min3 = c<a? c: a;
		int result = min1<min2? min1: min2<min3? min2: min3;
		System.out.println(result);
	}

}
