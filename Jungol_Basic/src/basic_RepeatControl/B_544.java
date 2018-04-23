package basic_RepeatControl;

import java.util.Scanner;

public class B_544 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		int i=0;
		
		if(a<=100) {
			for(i=a; i<=100; i++) {
				sum+=i;
				}
			}
		System.out.print(sum+" ");
		}
				
	}
