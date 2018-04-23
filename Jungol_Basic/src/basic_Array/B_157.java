/*
100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중
5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
평균은 소수점 이하 1자리까지 출력한다.

입력
35 10 23 100 64 51 5 0

출력
Multiples of 5 : 4
sum : 150
avg : 37.5
*/
package basic_Array;

import java.util.Scanner;

public class B_157 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100]; 
		int sum=0;
		int count=0;
		double avg=0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = input.nextInt();
			if(nums[i]==0) {
				break;
			}
			if(nums[i]%5==0) {
				sum+=nums[i];
				count++;
			}
		}
		avg = (double)sum/count;
		if(count==0) {
			avg = 0;
		}
		System.out.printf("Multiples of 5 : %d%n", count);
		System.out.printf("sum : %d%n", sum);
		System.out.printf("avg : %.1f%n", avg);
		
	}

}