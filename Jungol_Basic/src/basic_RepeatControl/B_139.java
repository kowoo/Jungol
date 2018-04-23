package basic_RepeatControl;

import java.util.Scanner;

public class B_139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();

		if(s>1||s<10||e>1||e<10) {
			if(s-e>=0) {
				for(int i=1; i<=9; i++) {
					for(int b=s; b>=e; b--) {
						System.out.printf("%d * %d = %2d   ", b, i, b*i);
					}
					System.out.println();
				}
			}else {
				for(int i=1; i<=9; i++) {
					for(int b=s; b<=e; b++) {
						System.out.printf("%d * %d = %2d   ", b, i, b*i);
					}
					System.out.println();
				}
			}
		}
	}
}
