/*

100개 이하의 정수를 입력받다가 0 이 입력되면
0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후 입력받은 정수를 차례로 출력하되
그 수가 홀수이면 2배한 값을,
짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.

8 10 5 15 100 0

5
4 5 10 30 50
*/
package basic_Array;

import java.util.Scanner;

public class B_158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[100];
		int count=0;

		for(int i=0; i<nums.length; i++) {
			nums[i] = input.nextInt();
			if(nums[i]==0) {
				break;
			}
			if(nums[i]%2!=0) {
				nums[i]=nums[i]*2;
				count++;
				
			}else {
				nums[i]=nums[i]/2;
				count++;
			}
		}
		
		System.out.println(count);
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				System.out.printf("%d ", nums[i]);
			} else {
				break;
			}
		}
		
		
	}

}