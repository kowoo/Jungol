/*
20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.

5
35 10 35 100 64

100
64
35
35
10
*/
package basic_Array;

import java.util.Scanner;

public class B_159 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		while(a>20) {
			a = input.nextInt();
		}
		int[] nums = new int[a];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = input.nextInt();
		}
		
		int tmp=0;
		for(int i=0; i<nums.length; i++) {
			tmp = nums[i];
			for(int j=i+1; j<nums.length; j++) {
				if(tmp<nums[j]) {
					tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
			}
		}

		for(int num: nums) {
		System.out.println(num);
		}
	}
}