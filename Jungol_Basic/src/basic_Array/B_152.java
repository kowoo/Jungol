package basic_Array;

import java.util.Scanner;

public class B_152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int oddSum=0;
		int evenSum=0;
		
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			
			if(i%2==0) {
				oddSum+=num[i];
			}
			if(i%2==1) {
				evenSum+=num[i];
			}
		}
		System.out.printf("odd : %d%n", oddSum);
		System.out.printf("even : %d", evenSum);
		
	}

}