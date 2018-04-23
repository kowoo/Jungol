package basic_RepeatControl;

import java.util.Scanner;

public class B_128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int counts = 0;

		while(true) {
			int a = sc.nextInt();
			if(a%3!=0 && a%5!=0) {
				counts++;
			}else if(a==0) {
				break;
			}

		}
		System.out.println(counts);
		
	}

}
