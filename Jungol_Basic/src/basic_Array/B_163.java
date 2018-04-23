/*
4행 3열의 배열을 선언하고 아래의 값으로 초기화 한 후 차례대로 출력한 후 배열의 모든 값을 더한 결과를 출력하는 프로그램을 작성하시오.
{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}}

3 5 9
2 11 5
8 30 10
22 5 1
111
*/
package basic_Array;

public class B_163 {

	public static void main(String[] args) {
		int[][] array = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		int sum=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				sum+=array[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}