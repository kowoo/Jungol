/*
배열을 만들어서 아래와 같이 저장한 후 출력하는 프로그램을 작성하시오. 규칙은 첫 번째 행은 모두 1로 초기화 하고 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것이다.

1 1 1 1 1
1 2 3 4 5
1 3 6 10 15
1 4 10 20 35
1 5 15 35 70
*/

package basic_Array;
public class B_570 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				if(i==0) {
					array[i][j]=1;
				} else if(j==0) {
					array[i][j]=1;
				} else {
					array[i][j]=array[i-1][j]+array[i][j-1];
				}
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}

