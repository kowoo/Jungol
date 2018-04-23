package basic_RepeatControl;

import java.util.Scanner;

public class B_537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = 1;
		int sum = 0;
		while(b<=a) {
			sum+=b;
			b++;
		}
		System.out.println(sum);
		
	}

}
