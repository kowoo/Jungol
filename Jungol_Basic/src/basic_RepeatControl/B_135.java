package basic_RepeatControl;

import java.util.Scanner;

public class B_135 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int sum=0;
		double avg=0;
		int point=0;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=b) {
			for(int i=b; i<=a; i++) {			
				if(i%3==0||i%5==0) {
					sum+=i;
					point++;
				}
			}
		}else {
			for(int i=a; i<=b; i++) {			
				if(i%3==0||i%5==0) {
					sum+=i;
					point++;
				}
			}
		}
		avg=(double)sum/point;
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f", avg);
	}
	
}
