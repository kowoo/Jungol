package basic_RepeatControl;

import java.util.Scanner;

public class B_141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while (num<0||num>100) {
			num = sc.nextInt();
		}
		
		for(int i=1; num*i<100; i++) {
			System.out.print(num*i+" ");
			if(num*i%10==0) {
				break;
			}
		}

	}
}
