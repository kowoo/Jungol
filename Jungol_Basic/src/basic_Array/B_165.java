/*
예제를 보고 적당한 배열을 선언한 후 1행의 1열과 3열 5열을 각각 1로 초기화하고
나머지는 모두 0으로 초기화 한 후 2행부터는 바로 위행의 왼쪽과 오른쪽의 값을
더하여 채운 후 출력하는 프로그램을 작성하시오.
1 0 1 0 1
0 2 0 2 0
2 0 4 0 2
0 6 0 6 0
6 0 12 0 6
*/
package basic_Array;

public class B_165 {

	public static void main(String[] args) {
		int[][] arr = new int [5][5];
		arr[0][0] = 1;
		arr[0][2] = 1;
		arr[0][4] = 1;
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2!=0 && j%2!=0) {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
				} else {
					if(j==0) {
						arr[i][j] = arr[i-1][j+1];
					} else if (j==2) {
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
					} else if (j==4) {
						arr[i][j] = arr[i-1][j-1];				
					}

				}
			}			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}