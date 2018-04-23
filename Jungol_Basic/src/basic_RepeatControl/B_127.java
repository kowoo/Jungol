package basic_RepeatControl;

import java.util.Scanner;

public class B_127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a;
		int sum=0;
		int counts=0;
		while(true) {
			a = sc.nextInt();
			if (a<0 || a>100) {
				break;
			}
			sum+=a;
			counts++;
		}
		double avg=sum/(double) counts;
		System.out.printf("sum : %d%navg : %.1f", sum, avg);


	}

}
