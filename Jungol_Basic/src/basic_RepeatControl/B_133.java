package basic_RepeatControl;

import java.util.Scanner;

public class B_133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int num=0;
		int sum=0;
		double avg=0;
		
		int a = sc.nextInt();
		if (a<=100) {
			for(int i=0;i<a;i++) {
				num = sc.nextInt();
				sum+=num;
			}
		}
		avg = (double)sum/a;
		System.out.printf("%.2f", avg);
		
	}

}
