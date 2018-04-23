//세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고
//그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.입력받는 정수는 100개 이하이다.
//
//45 19 123 58 10 -55 16 -1 999
//
//max : 123 
//min : -55
package basic_Array;

import java.util.Scanner;

public class B_156 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100]; 
		int min=0;
		int max=0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = input.nextInt();
			if(nums[i]==999) {
				break;
			}
			if(i==0) {
			max = nums[i];
			min = nums[i];
			}
			
			if(i>0&&nums[i]<1000) {
				if(nums[i]<=min) {
					min=nums[i];					
				}
				if(nums[i]>=max) {
					max=nums[i];
				}
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		
	}

}