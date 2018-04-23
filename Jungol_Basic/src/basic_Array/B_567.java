/*
3행 5열의 배열을 아래 출력 예와 같이 초기화 한 후 출력하는 프로그램을 작성하시오.
숫자사이의 공백은 3칸으로하고 각 숫자는 2칸으로 오른쪽에 맞추어 출력한다. 예, "%2d   "

출력 예 => 현재행은 출력되지 않습니다.
 5    8   10    6    4
11   20    1   13    2
 7    9   14   22    3
 */
package basic_Array;

public class B_567 {

	public static void main(String[] args) {

		int[][] nums = {{5, 8, 10, 6, 4}, {11, 20, 1, 13, 2}, {7, 9, 14, 22, 3}};

		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.printf("%2d   ", nums[i][j]);
			}
			System.out.println();
		}
	}

}

