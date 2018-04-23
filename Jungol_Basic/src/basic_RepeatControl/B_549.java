package basic_RepeatControl;

import java.util.Scanner;

public class B_549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		int count=0;
		
		OutFor:
		for(int i=1; ; i++) {
			if(i%2==1) {
				sum+=i;
				count++;
			}
			if(sum>=a) {
				break OutFor;
			}
		}
		System.out.printf("%d %d", count, sum);
		
	}

}
