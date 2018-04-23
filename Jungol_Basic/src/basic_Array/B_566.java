/*
100 이하의 자연수를 입력받아 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고 다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.

62

100 62 38 24 14 10 4 6 -2
*/
package basic_Array;

import java.util.Scanner;

public class B_566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[100];

		nums[0] = 100;
		nums[1] = sc.nextInt();
		while(nums[1]>100&&nums[1]<0) {
			nums[1] = sc.nextInt();
		}
		int tmp=0;
		
		for(int i=0; i<nums.length; i++) {
			if(i==0||i==1) {
				System.out.print(nums[i]+" ");
			} else {
			nums[i] = nums[i-2]-nums[i-1];
			System.out.print(nums[i]+" ");
			}
			if(nums[i]<0) {
				break;
			}
		}
		
		
	}

}

