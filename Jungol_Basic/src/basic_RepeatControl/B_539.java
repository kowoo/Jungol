package basic_RepeatControl;

import java.util.Scanner;

public class B_539 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int counts=0;
		int sum=0;
		double avg=0;

		while(true) {
			a = sc.nextInt();
			sum = sum+a;
			counts++;
			if(a>=100) {
				break;
			}
		}
		avg = (double) sum/counts;
		System.out.println(sum);
		System.out.printf("%.1f",avg);

	}

}
