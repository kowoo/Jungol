/*
10 미만의 자연수 두 개를 입력받아서 첫 번째 항과 두 번째 항을 입력받은 수로 초기화 시킨 후 세 번째 항부터는 전전항과 전항의 합을 구하여 그 합의 1의 자리로 채워서 차례로 10개를 출력하는 프로그램을 작성하시오.
3 5
3 5 8 3 1 4 5 9 4 3
*/
package basic_Array;

import java.util.Scanner;

public class B_162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(a<0||a>10) {
			a = sc.nextInt();
		}
		while(b<0||b>10) {
			b = sc.nextInt();
		}
		
		int[] nums = new int[10];
		nums[0] = a;
		nums[1] = b;
		
		for(int i=2; i<nums.length; i++) {
			nums[i]=nums[i-2]+nums[i-1];
			if(nums[i]>=10) {
				nums[i]-=10;
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}