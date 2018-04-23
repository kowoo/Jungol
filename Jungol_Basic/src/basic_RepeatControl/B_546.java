package basic_RepeatControl;

import java.util.Scanner;

public class B_546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		int sum=0;
		double avg=0;
		
		int play=sc.nextInt();
		if(play<=10) {
			for(int i=0;i<play;i++) {
				score=sc.nextInt();
				sum+=score;
			}
		}
		avg=(double)sum/play;
		
		String result = avg>=80?"pass":"fail";
		System.out.printf("avg : %.1f%n", avg);
		System.out.printf("%s", result);

	}

}