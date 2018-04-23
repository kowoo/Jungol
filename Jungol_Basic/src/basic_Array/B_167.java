package basic_Array;

import java.util.Scanner;

public class B_167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] nums = new int[4][2];
		int all = 0;
		
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			int wA=0;
			for(int j=0; j<nums[i].length; j++) {
				wA=wA+nums[i][j];
				all=all+nums[i][j];
			}
			System.out.printf("%d ",(wA/nums[i].length));
		}
		System.out.println();
		
		for(int i=0; i<nums[i].length; i++) {
			int hA=0;
			for(int j=0; j<nums.length; j++) {
				hA=hA+nums[j][i];
			}
			System.out.printf("%d ",(hA/nums.length));
		}
		System.out.println();
		System.out.printf("%d",(all/(nums.length*nums[1].length)));

		//		
//		for(int i=0; i<nums.length; i++) {
//			int[] sum= new int[nums[i].length];
//			double hA=0;
//			for(int j=0; j<nums[i].length; j++) {
//				sum[nums[i].length] = sum[nums[i].length]+nums[i][j];
//			}
//			hA=
//
//		}

		
		
	}

}


//
//for(int i=0; i<nums.length; i++) {
//	for(int j=0; j<nums[i].length; j++) {
//		nums[i][j] = sc.nextInt();
//		sum = sum+nums[i][j];
//	}
//	
//	
//	
//}
//	
//for(int i=0; i<nums.length; i++) {
//	int wSum=0; //가로 출력용
//	for(int j=0; j<nums[i].length; j++) {
//		wSum = wSum+nums[i][j];
//	}
//	System.out.print(wSum/nums[i].length+" ");
//}
//System.out.println();
//
//for(int i=0; i<nums[i].length; i++) {
//	int hSum=0; //세로 출력용
//	for(int j=0; j<nums.length; j++) {
//		hSum = hSum+nums[j][i];
//	}
//	System.out.print(hSum/nums.length+" ");
//}
//System.out.println();
//
//
//System.out.printf("%.0f", sum/8);