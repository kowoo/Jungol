package basic_RepeatControl;

import java.util.Scanner;

public class B_131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a<=100&&b<=100) {
			if(a>=b) {
				for(int i=b; i<=a; i++) {
					System.out.print(i+" ");
				}
			} else {
				for(int j=a; j<=b; j++) {
					System.out.print(j+" ");
				}
			}
		}
		
	}

}
