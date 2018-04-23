package basic_RepeatControl;

import java.util.Scanner;

public class B_540 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;

		while(true) {
			a = sc.nextInt();
			if(a%3==0) {
				System.out.println(a/3);
			}
			if(a==-1) {
				break;
			}
		}

	}

}
