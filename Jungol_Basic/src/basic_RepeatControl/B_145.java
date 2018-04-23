package basic_RepeatControl;

import java.util.Scanner;

public class B_145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n>0) {
			for(int i=1; i<=n; i++) {
				for(int j=0; j<(n-i)*2; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=i; k++) {
					System.out.print(k+" ");
				}
				System.out.println();
			}
		}
	}
}
