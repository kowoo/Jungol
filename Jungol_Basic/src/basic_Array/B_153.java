//
//100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
//(입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
//
//30 20 10 60 80 -1
//
//10 60 80

package basic_Array;

import java.util.Scanner;

public class B_153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[100];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			
			if(nums[i]==-1) {
				for(int j=i-3; j<i ; j++) {
					if(j<0) {
						for(; j<0; j++) {
						}
						System.out.print(nums[j]+" ");
					}else {
						System.out.print(nums[j]+" ");
					}
				}
				break;
			}
		}
		
	}

}