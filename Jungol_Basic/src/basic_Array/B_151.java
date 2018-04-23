package basic_Array;

import java.util.Scanner;

public class B_151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int[] sum = new int[1];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			
			if(i%2==0) {
				sum[0]+=num[i];
			}
			
		}
		System.out.print(sum[0]);
		
	}

}